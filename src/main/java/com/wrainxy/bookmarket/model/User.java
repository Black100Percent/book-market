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
 * @date 2019/07/19 20:27
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**主键ID*/
    @TableId(value = "ID",type = IdType.UUID)
    private String id;

    /**账号名称*/
    @TableField(value = "USER_NAME")
    private String userName;

    /**账号密码*/
    @TableField(value = "PASSWORD")
    private String password;

    /**用户全称*/
    @TableField(value = "FULL_NAME")
    private String fullName;

    /**性别，0-女，1-男，默认1*/
    @TableField(value = "SEX")
    private Integer sex;

    /**手机号码*/
    @TableField(value = "MOBILE_NO")
    private String mobileNo;

    /**电子邮箱*/
    @TableField(value = "EMAIL")
    private String email;

    /**状态（-1：禁用；1：账号可正常使用)*/
    @TableField(value = "STATUS")
    private Integer status;

    /**账号创建时间*/
    @TableField(value = "CREATE_TIME")
    private String createTime;

    public User(String userName, String password,String passwordA) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", sex=" + sex +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
