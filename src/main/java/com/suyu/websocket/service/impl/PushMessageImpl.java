package com.suyu.websocket.service.impl;

import com.suyu.websocket.domain.PushMessage;
import com.suyu.websocket.repository.PushMessageRepository;
import com.suyu.websocket.service.IPushMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.service.impl
 * @Author: lizeze
 * @CreateTime: 2019-04-18 17:19
 * @Description: ${Description}
 */
@Service
public class PushMessageImpl implements IPushMessageService {

    @Autowired
    private PushMessageRepository pushMessageRepository;

    @Override
    public void AddMessage(PushMessage pushMessage) {

        pushMessageRepository.save(pushMessage);

    }
}
