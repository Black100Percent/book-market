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
 * @date 2019/07/20 12:42
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("sys_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**主键ID*/
    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    /**买家ID*/
    @TableField(value = "USER_ID")
    private String userId;

    /**订单创建时间*/
    @TableField(value = "CREATE_TIME")
    private String createTime;

    /**订单结束时间*/
    @TableField(value = "FINISH_TIME")
    private String finishTime;

    /**收货人姓名*/
    @TableField(value = "RECEIVER_NAME")
    private String receiverName;

    /**收货地址*/
    @TableField(value = "ADDRESS")
    private String address;

    /**收货人电话*/
    @TableField(value = "MOBILE_NO")
    private String mobileNo;

    /**买家留言*/
    @TableField(value = "MESSAGE")
    private String message;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", finishTime='" + finishTime + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
