package com.suyu.websocket.vo;

import java.util.Date;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.vo
 * @Author: lizeze
 * @CreateTime: 2019-04-18 09:54
 * @Description: ${Description}
 */
public class Message {

    private String id;

    private  String content;

    private  String userCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserCode() {
        return userCode;
    }
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
