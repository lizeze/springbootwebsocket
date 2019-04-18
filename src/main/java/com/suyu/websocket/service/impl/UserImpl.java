package com.suyu.websocket.service.impl;

import com.suyu.websocket.domain.User;
import com.suyu.websocket.repository.UserRepository;
import com.suyu.websocket.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.service.impl
 * @Author: lizeze
 * @CreateTime: 2019-04-18 17:22
 * @Description: ${Description}
 */
@Service
public class UserImpl implements IUserService {

    @Autowired
     private UserRepository userRepository;
    @Override
    public User fidnByAppId(String appId) {
        return  userRepository.findByAppId(appId);
    }
}
