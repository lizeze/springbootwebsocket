package com.suyu.websocket.vo;

import java.util.List;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.vo
 * @Author: lizeze
 * @CreateTime: 2019-04-18 10:10
 * @Description: ${Description}
 */
public class SocketResult {

     private  Boolean isMessage;
     private List<Message> messageList;

    public Boolean getMessage() {
        return isMessage;
    }

    public void setMessage(Boolean message) {
        isMessage = message;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}
