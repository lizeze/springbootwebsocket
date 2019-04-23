package com.suyu.websocket.vo;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.vo
 * @Author: lizeze
 * @CreateTime: 2019-04-19 10:43
 * @Description: ${Description}
 */
public class SocketBody {

     private  String userCode;
     private  String message;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
