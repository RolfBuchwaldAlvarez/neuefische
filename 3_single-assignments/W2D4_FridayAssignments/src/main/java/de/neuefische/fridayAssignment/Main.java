package de.neuefische.fridayAssignment;

import de.neuefische.fridayAssignment.interfaces.ID;
import de.neuefische.fridayAssignment.model.Product;
import de.neuefische.fridayAssignment.utils.ProductDB;
import de.neuefische.fridayAssignment.model.Order;
import de.neuefische.fridayAssignment.utils.OrderDB;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Set Product List
        Product chocBar1 = new Product(1, "Snicker", 1.20);
        Product chocBar2 = new Product(2, "Bounty", 1.10);
        Product chocBar3 = new Product(3, "Mars", 1.15);
        Product chocBar4 = new Product(4, "MilkyWay", 1.00);
        Product gummies1 = new Product(5, "Haribo", 0.90);
        Product gummies2 = new Product(6, "Katjes", 1.00);
        Product gummies3 = new Product(7, "Trolli", 0.50);

        List<Product> transferList = List.of(chocBar1, chocBar2, chocBar3, chocBar4, gummies1, gummies2, gummies3);
        ArrayList<Product> productList = new ArrayList<>(transferList);

        ProductDB productDB = new ProductDB(productList);

/*
        for (Product product : productDB.getProducts()) {
            System.out.println(product.getID() + ": " + product.getName());
        }
 */
        //New Order
        List<Product> productOrderList = List.of(chocBar2, chocBar4, gummies2);
        ArrayList<Product> newOrderList = new ArrayList<>(productOrderList);
        int orderNumber = Order.getCounter() + 1;
        Order newOrder = new Order(orderNumber, newOrderList);

        //Check if Order is a Valid Order



    }
}