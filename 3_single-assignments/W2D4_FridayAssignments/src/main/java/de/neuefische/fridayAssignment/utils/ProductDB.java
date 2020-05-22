package de.neuefische.fridayAssignment.utils;

import de.neuefische.fridayAssignment.interfaces.ID;
import de.neuefische.fridayAssignment.model.Order;
import de.neuefische.fridayAssignment.model.Product;

import java.util.ArrayList;

public class ProductDB {

    private final ArrayList<Product> productList;

    public ProductDB(ArrayList<Product> productList){
        this.productList = productList;
    }

   /* public Order list(){

    }

    */

    public ArrayList<Product> getProducts(){
        return this.productList;
    }

    public int size(){
        return productList.size();
    }



}
