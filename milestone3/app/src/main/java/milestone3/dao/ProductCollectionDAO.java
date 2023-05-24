/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milestone3.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import milestone3.domain.Product;

/**
 *
 * @author dyrellumiwes
 */
public class ProductCollectionDAO {
    
    private static Collection<Product> products = new HashSet<>();
    private static Collection<String> category = new HashSet<>();
    private static Collection<String> productId = new HashSet<>();   

     private static Collection<Product> products2 = new HashMap(Integer, <Product>);



    
     /*
    * Save product to DAO collection
    * @params product - The product to save to collection
    */
    public void saveProduct(Product product){
        //Add product to collection
        products.add(product);
        category.add(product.getCategory());
        productId.add(product.getProductId());
    }
    
    public Collection<Product> getProducts(){
        return products;
    }
    
       public Collection<String> getCategories(){
        return category;
    }
    
      public void removeProduct(Product product){
         products.remove(product);
         
    }
      
    public Product searchById(String id){
        //If the id is in the id collection
        if(productId.contains(id)){
            //Create ArrayList from product collection
            ArrayList<Product> productsArray = new ArrayList<>(products);
            
            //Loop through every element in array list
            for(int x = 0; x < productsArray.size(); x++){
                Product compareProduct = productsArray.get(x);
                
                //If the searched id matches element id
                if(compareProduct.getProductId().equals(id)){
                    //return that product element
                    return productsArray.get(x);
                }  
            }
        }
        return null;
    }
    //Correct
    
    
    
    
}
