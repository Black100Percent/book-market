package com.wrainxy.bookmarket.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author wangxiaoyu
 * @date 2019/07/20 13:03
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("sys_order_store")
public class OrderStore implements Serializable {

    private static final long serialVersionUID = 1L;

    /**订单ID*/
    @TableId(value = "ORDER_ID",type = IdType.UUID)
    private String orderId;

    /**书店ID*/
    @TableField(value = "STORE_ID")
    private String storeId;

    public OrderStore(String orderId, String storeId) {
        this.orderId = orderId;
        this.storeId = storeId;
    }

    @Override
    public String toString() {
        return "OrderStore{" +
                "orderId='" + orderId + '\'' +
                ", storeId='" + storeId + '\'' +
                '}';
    }
}
