package milestone3.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dyrellumiwes
 */




public class Sale {
  private Integer saleID;
    private LocalDateTime date;
    private String status;
    private Customer customer;
    private ArrayList<SaleItem> items;  
    //maybe change to collection
    
    
    public BigDecimal getTotal(){
        BigDecimal total = new BigDecimal(0);
        
        for(int i = 0; i< items.size();i++){
           BigDecimal itemTotal = items.get(i).getItemTotal();
                total.add(itemTotal);

        }
        return total;
    }
    
    public void addItem(SaleItem saleItem){
        items.add(saleItem);
    }
    
    public Integer getSaleID() {
        return saleID;
    }

    public void setSaleID(Integer saleID) {
        this.saleID = saleID;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection<SaleItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<SaleItem> items) {
        this.items = items;
    }
    
     
    
}

