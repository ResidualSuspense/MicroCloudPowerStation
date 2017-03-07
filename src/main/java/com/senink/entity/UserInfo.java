package com.senink.entity;

import com.senink.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017-03-07.
 */
@Entity(name = "UserInfo")
public class UserInfo extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Integer id;
    @Column(name = "uuid",length = 16,unique = true,nullable = false)
    private String uuid;
    @Column(name = "mobile",length = 12,unique = true,nullable = false)
    private String mobile;
    @Column(name = "WeChat",unique = true)
    private String weChat;
    @Column(name = "Alipay",unique = true)
    private String alipay;
    @Column(name = "SecurityCode")
    private String securityCode;
    @Column(name = "Type",nullable = false)
    private Integer type;
    @Column(name = "Balance")
    private Float balance;

    public Integer getId() {;
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
