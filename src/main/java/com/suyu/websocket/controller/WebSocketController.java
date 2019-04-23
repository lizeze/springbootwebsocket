package com.suyu.websocket.controller;

import com.alibaba.fastjson.JSON;
import com.suyu.websocket.domain.User;
import com.suyu.websocket.server.SocketServer;
import com.suyu.websocket.service.IPushMessageService;
import com.suyu.websocket.service.IUserService;
import com.suyu.websocket.vo.Message;
import com.suyu.websocket.vo.SocketBody;
import com.suyu.websocket.vo.SocketResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * websocket
 * 消息推送(个人和广播)
 */
@Controller
public class WebSocketController {
    @Autowired
    private SocketServer socketServer;
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private IUserService userService;

    @Autowired
    private IPushMessageService pushMessageService;

    @RequestMapping(value = "/index")
    public String idnex() {

        return "index";
    }

    @RequestMapping(value = "/admin")
    public String admin(Model model) {
        int num = socketServer.getOnlineNum();
        String str = socketServer.getOnlineUsers();
        List<String> list = null;
        if (str.length() > 2) {
            str = str.substring(0, str.length() - 1);
            String[] strs = str.split(",");
            list = Arrays.asList(strs);
        }


        model.addAttribute("num", num);
        model.addAttribute("users", list);
        return "admin";
    }

    /**
     * 个人信息推送
     *
     * @return
     */
    @RequestMapping("sendmsg")
    @ResponseBody
    public String sendmsg(String msg, String username) {
        //第一个参数 :msg 发送的信息内容
        //第二个参数为用户长连接传的用户人数
        String[] persons = username.split(",");
        SocketServer.SendMany(msg, persons);
        return "success";
    }


    /**
     * 获取当前在线用户
     *
     * @return
     */
    @RequestMapping("webstatus")
    public String webstatus() {
        //当前用户个数
        int count = SocketServer.getOnlineNum();
        //当前用户的username
        SocketServer.getOnlineUsers();
        return "tongji";
    }


    /**
     * 推送给所有在线用户
     *
     * @return
     */

    @RequestMapping("/sendAll")
    @ResponseBody
    public ResponseEntity<?> sendAll() throws Exception {


        if (!validity())
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("NO FORBIDDEN");
        List<Message> messageList = new ArrayList<>();
//        SocketServer.sendAll(JSON.toJSONString(socketResult));
        return ResponseEntity.status(HttpStatus.OK).body("success");
    }
    private boolean validity() throws Exception {
        String appId = request.getHeader("Authorization");
        if (appId == null) return false;
        User user = userService.fidnByAppId(appId);
        if (user == null) return false;
        return user.getIsEnable() == 1;
    }
    @RequestMapping("/push")
    @ResponseBody
    public ResponseEntity<?> pushMessage(@RequestBody SocketBody socketBody) throws Exception {

        if (socketBody == null || socketBody.getUserCode().length() <= 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("BAD_REQUEST");
        }
        if (!validity())
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("NO FORBIDDEN");
        String[] persons = socketBody.getUserCode().split(",");
        SocketServer.SendMany(socketBody.getMessage(), persons);

        return ResponseEntity.status(HttpStatus.OK).body("OK");

    }
}
