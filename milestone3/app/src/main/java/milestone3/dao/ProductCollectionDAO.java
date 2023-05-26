/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milestone3.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import milestone3.domain.Product;

/**
 *
 * @author dyrellumiwes
 */
public class ProductCollectionDAO {
    
        public static HashMap<String, Product> productMap = new HashMap<>();

    private static Collection<Product> products = new HashSet<>();
    private static Collection<String> category = new HashSet<>();



    
     /*
    * Save product to DAO collection
    * @params product - The product to save to collection
    */
    public void saveProduct(Product product){
        products.add(product);
        category.add(product.getCategory());
        productMap.put(product.getProductId(), product);
    }
    
    public Collection<Product> getProducts(){
       /* Collection<Product> products = new HashSet<>();
        for(String p : productMap.keySet()){
            products.add(productMap.get(p));
        }*/
        return products;
    }
    
       public Collection<String> getCategories(){
        return category;
    }
    
      public void removeProduct(Product product){
         products.remove(product);
        productMap.put(product.getProductId(), null);
        productMap.remove(product.getProductId());
      //  if(productMap.get(product.getProductId()).getCategory() != null){
       //     
       // }
    }
      
    public Product searchById(String id){
        return productMap.get(id);
     
    }
    //Correct
    
    
    
    
}
