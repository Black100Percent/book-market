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
 * @date 2019/07/19 20:54
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("sys_book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    /**主键ID*/
    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    /**书名*/
    @TableField(value = "NAME")
    private String name;

    /**图书类别（1：IT技术；2：通信技术；3：文学小说；4：人文历史；5：金融；6：工作规范)*/
    @TableField(value = "CLASSIFICATION")
    private Integer classification;

    /**出版社*/
    @TableField(value = "PRESS")
    private String press;

    /**作者*/
    @TableField(value = "AUTHOR")
    private String author;

    /**出版时间*/
    @TableField(value = "PUBLISH_TIME")
    private String publishTime;

    /**价格*/
    @TableField(value = "PRICE")
    private String price;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classification=" + classification +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                ", publishTime=" + publishTime +
                ", price='" + price + '\'' +
                '}';
    }
}
