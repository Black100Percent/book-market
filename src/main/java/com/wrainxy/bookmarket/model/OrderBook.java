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
 * @date 2019/07/20 13:07
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("sys_order_book")
public class OrderBook implements Serializable {

    private static final long serialVersionUID = 1L;

    /**订单ID*/
    @TableId(value = "ORDER_ID",type = IdType.UUID)
    private String orderId;

    /**图书ID*/
    @TableField(value = "BOOK_ID")
    private String bookId;

    /**图书数量*/
    @TableField(value = "QUANTITY")
    private Integer quantity;

    public OrderBook(String orderId, String bookId, Integer quantity) {
        this.orderId = orderId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderBook{" +
                "orderId='" + orderId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
