package com.xfor.infrastructure.core.store.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xfor.infrastructure.core.common.model.IDateTimeProvider;
import com.xfor.infrastructure.core.product.model.Product;
import lombok.Data;

import java.util.Date;
import java.util.Random;

/**
 * 购物车项
 */
@Data
public class StoreCartEntry {

    public static String _newId() {
        Random ra =new Random();
        int number = ra.nextInt(9999999) + 1;
        String id = String.format("%04d", number);
        return id;
    }

    public static StoreCartEntry _createFromProduct(
            Product product,
            int productQuantity,
            IDateTimeProvider dateTimeProvider) {
        StoreCartEntry storeCartEntry = new StoreCartEntry();
        storeCartEntry.setId(_newId());
        storeCartEntry.setProductSid(product.getSid());
        storeCartEntry.setProductPrice(product.getPrice());
        storeCartEntry.setProductQuantity(productQuantity);
        storeCartEntry.setCreateTime(dateTimeProvider.getNow());
        return storeCartEntry;
    }

    @JsonProperty("Id")
    private String id;

    @JsonProperty("ProductSid")
    private String productSid;  //商品唯一标识

    @JsonProperty("ProductPrice")
    private float productPrice;  //商品价格

    @JsonProperty("ProductQuantity")
    private float productQuantity;  //商品数量

    @JsonProperty("CreateTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}