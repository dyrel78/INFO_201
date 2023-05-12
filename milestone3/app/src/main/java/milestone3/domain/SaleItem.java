/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milestone3.domain;

import java.math.BigDecimal;

/**
 *
 * @author dyrellumiwes
 */
public class SaleItem {
    private BigDecimal quantityPurchased;
    public BigDecimal salePrice;
    private Product product;

    public BigDecimal getItemTotal(){
        BigDecimal itemTotal = quantityPurchased.multiply(salePrice);

        return itemTotal;
    }
    
}
