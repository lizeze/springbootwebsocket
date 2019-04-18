package com.suyu.websocket.repository;

import com.suyu.websocket.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.repository
 * @Author: lizeze
 * @CreateTime: 2019-04-18 17:10
 * @Description: ${Description}
 */
public interface UserRepository  extends JpaRepository<User,String> {

     User findByAppId(String appId);



}
