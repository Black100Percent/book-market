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
 * @date 2019/07/20 12:29
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("sys_store")
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    /**主键ID*/
    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    /**店名*/
    @TableField(value = "STORE_NAME")
    private String storeName;

    /**店长*/
    @TableField(value = "MANAGER")
    private String manager;

    /**联系电话*/
    @TableField(value = "CONTACT_INFO")
    private String contactInfo;

    /**书店邮箱*/
    @TableField(value = "EMAIL")
    private String email;

    /**状态*/
    @TableField(value = "STATUS")
    private Integer status;

    /**星级*/
    @TableField(value = "STAR")
    private Integer star;

    /**创建时间*/
    @TableField(value = "EMAIL")
    private String createTime;

    @Override
    public String toString() {
        return "Store{" +
                "id='" + id + '\'' +
                ", storeName='" + storeName + '\'' +
                ", manager='" + manager + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", star=" + star +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
