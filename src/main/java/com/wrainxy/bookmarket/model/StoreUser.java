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
 * @date 2019/07/20 12:58
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("sys_store_user")
public class StoreUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**书店ID*/
    @TableId(value = "STORE_ID",type = IdType.UUID)
    private String storeId;

    /**店员账号ID*/
    @TableField(value = "USER_ID")
    private String userId;

    /**进店工作时间*/
    @TableField(value = "JOIN_TIME")
    private String joinTime;

    public StoreUser(String storeId, String userId, String joinTime) {
        this.storeId = storeId;
        this.userId = userId;
        this.joinTime = joinTime;
    }

    @Override
    public String toString() {
        return "StoreUser{" +
                "storeId='" + storeId + '\'' +
                ", userId='" + userId + '\'' +
                ", joinTime='" + joinTime + '\'' +
                '}';
    }
}
