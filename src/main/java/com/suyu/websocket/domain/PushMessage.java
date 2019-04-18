package com.suyu.websocket.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.domain
 * @Author: lizeze
 * @CreateTime: 2019-04-18 17:00
 * @Description: ${Description}
 */
@Entity  // 实体
@XmlRootElement  // MediaType 转为 XML
@Table(name = "T_SYS_PUSHMESSAGE")
public class PushMessage {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private  String id;
    @Column(name = "APPID")
    private  String appId;
    @Column(name = "MESSAGE")
    private  String message;
    @Column(name = "CREATETIME")
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
