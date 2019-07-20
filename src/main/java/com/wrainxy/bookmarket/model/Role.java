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
 * @date 2019/07/19 20:44
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("sys_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**主键ID*/
    @TableId(value = "ID",type = IdType.UUID)
    private String id;

    /**角色名称*/
    @TableField(value = "NAME")
    private String name;

    /**角色中文名称*/
    @TableField(value = "NAME_CN")
    private String nameCn;

    /**账号创建时间*/
    @TableField(value = "CREATE_TIME")
    private String createTime;

    public Role(String name, String nameCn) {
        this.name = name;
        this.nameCn = nameCn;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nameCn='" + nameCn + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
