package com.hexiaofei.springeurekaclient.domain;

import java.util.Date;

/**
 * Created by Administrator on 2017/12/25.
 */
public class OrderVo {

    private Integer orderId;
    private Integer userId;
    private String orderName;
    private String createTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
