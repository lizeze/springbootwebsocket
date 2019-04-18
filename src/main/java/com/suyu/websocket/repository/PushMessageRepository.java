package com.suyu.websocket.repository;

import com.suyu.websocket.domain.PushMessage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.repository
 * @Author: lizeze
 * @CreateTime: 2019-04-18 17:08
 * @Description: ${Description}
 */
public interface PushMessageRepository  extends JpaRepository<PushMessage,String> {


}
