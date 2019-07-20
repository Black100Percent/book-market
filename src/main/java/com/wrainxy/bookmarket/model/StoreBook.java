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
 * @date 2019/07/20 12:54
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("sys_store_book")
public class StoreBook implements Serializable {

    private static final long serialVersionUID = 1L;

    /**书店ID*/
    @TableId(value = "STORE_ID",type = IdType.UUID)
    private String storeId;

    /**图书ID*/
    @TableField(value = "BOOK_ID")
    private String bookId;

    /**图书数量*/
    @TableField(value = "QUANTITY")
    private Integer quantity;

    public StoreBook(String storeId, String bookId, Integer quantity) {
        this.storeId = storeId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StoreBook{" +
                "storeId='" + storeId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
