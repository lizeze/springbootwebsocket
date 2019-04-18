package com.suyu.websocket.service;

import com.suyu.websocket.domain.PushMessage;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.service
 * @Author: lizeze
 * @CreateTime: 2019-04-18 17:13
 * @Description: ${Description}
 */
public interface IPushMessageService {

    public  void  AddMessage(PushMessage pushMessage);


}
