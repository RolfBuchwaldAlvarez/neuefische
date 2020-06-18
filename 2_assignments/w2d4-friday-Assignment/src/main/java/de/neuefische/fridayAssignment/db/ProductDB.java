package de.neuefische.fridayAssignment.db;

import de.neuefische.fridayAssignment.model.Product;

import java.util.ArrayList;

public class ProductDB {

    private final ArrayList<Product> productList;

    public ProductDB(ArrayList<Product> productList){

        this.productList = productList;
    }

    public void listProductList() {
        System.out.println("Products saved in list:");
        for (Product product : productList) {
            System.out.println("ID: " + product.getID() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
        }
        System.out.println();
    }

    public ArrayList<Product> getProductList(){

        return this.productList;
    }

}
