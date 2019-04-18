package com.suyu.websocket.service;

import com.suyu.websocket.domain.User;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.service
 * @Author: lizeze
 * @CreateTime: 2019-04-18 17:18
 * @Description: ${Description}
 */
public interface IUserService {

      public User fidnByAppId(String appId);
}
