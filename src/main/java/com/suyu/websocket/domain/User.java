package com.suyu.websocket.domain;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * @BelongsProject: aq-websocket
 * @BelongsPackage: com.suyu.websocket.domain
 * @Author: lizeze
 * @CreateTime: 2019-04-18 16:40
 * @Description: ${Description}
 */
@Entity  // 实体
@XmlRootElement  // MediaType 转为 XML
@Table(name = "T_SYS_PUSH_USER")
public class User {

     @Id
     @GeneratedValue
     @Column(name = "ID")
     private  String  id;
     @Column(name = "APPID")
     @GeneratedValue
     private  String appId;
     @Column(name = "USERNAME")
     private  String userName;
     @Column(name = "CREATETIME")
     private Date createTime;
     @Column(name = "ISENABLE")
     private  Integer isEnable;
     @Column(name = "VALIDITY")
     private  Integer validity;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }
}
