/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raagatech.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author sarve
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductsAndServicesBean {
    private String productCategoryId;
    private String productId;
    private String productName;
    private String productDescription;
    private String offerPrice;
    private String discount;
    private String snap;
    private String vendorId;
    private String sequence;
    private int quantity;
    private String unit;
    private int itemId;
}
