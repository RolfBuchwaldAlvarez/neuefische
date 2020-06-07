package de.neuefische.fridayAssignment;

import de.neuefische.fridayAssignment.model.Product;
import de.neuefische.fridayAssignment.db.OrderDB;
import de.neuefische.fridayAssignment.db.ProductDB;
import de.neuefische.fridayAssignment.model.Order;
import de.neuefische.fridayAssignment.service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Create Products
        Product chocBar1 = new Product(1, "Snickers", "1.20");
        Product chocBar2 = new Product(2, "Bounty", "1.10");
        Product chocBar3 = new Product(3, "Mars", "1.15");
        Product chocBar4 = new Product(4, "MilkyWay", "1.00");
        Product gummies1 = new Product(5, "Haribo", "0.90");
        Product gummies2 = new Product(6, "Katjes", "1.00");
        Product gummies3 = new Product(7, "Trolli", "0.50");

        //Create Product List
        List<Product> transferList = List.of(chocBar1, chocBar2, chocBar3, chocBar4, gummies1, gummies2, gummies3);
        ArrayList<Product> productList = new ArrayList<>(transferList);

        //Save Product List in ProductDB Object
        ProductDB productDB = new ProductDB(productList);

        //Print Product List
        productDB.listProductList();

        //First Order (bestehender Warenkorb wird zur verbindlichen Bestellung)
        List<Product> productOrderList = List.of(chocBar2, chocBar4, gummies2);
        ArrayList<Product> newOrderList = new ArrayList<>(productOrderList);
        int orderID = Order.getCounter() + 1;
        Order firstOrder = new Order(orderID, newOrderList);

        //Print First Order
        firstOrder.listOrder();

        //Check if First Order is a Valid Order (OrderService)
       if (OrderService.addOrder(firstOrder, productDB)) {

           //Safe Valid Order in OrderDB-List
           ArrayList<Order> orderList = OrderService.getValidatedOrder();
           OrderDB.setOrderList(orderList);

           //Print OrderDB-List
           OrderDB.listOrderList();
       } else {
           System.out.println("Software Error!");
       }


        //Second Order (bestehender Warenkorb wird zur verbindlichen Bestellung)
        productOrderList = List.of(chocBar1, gummies3);
        newOrderList = new ArrayList<>(productOrderList);
        orderID = Order.getCounter() + 1;
        Order secondOrder = new Order(orderID, newOrderList);

        //Print Second Order
        secondOrder.listOrder();

        //Check if Second Order is a Valid Order (OrderService)
        if(OrderService.addOrder(secondOrder, productDB)) {
            //Safe Valid Order in OrderDB-List
            OrderDB.setOrderList(OrderService.getValidatedOrder());

            //Print OrderDB-List
            OrderDB.listOrderList();
        } else {
            System.out.println("Software Error!");
        }

        //Third Order
        productOrderList = List.of(chocBar1, chocBar2, chocBar3, gummies1);
        newOrderList = new ArrayList<>(productOrderList);
        orderID = Order.getCounter() + 1;
        Order thirdOrder = new Order(orderID, newOrderList);

        //Print Third Order
        thirdOrder.listOrder();

        //Check if Third Order is a Valid Order (OrderService)
        if(OrderService.addOrder(thirdOrder, productDB)) {
            //Safe Valid Order in OrderDB-List
            OrderDB.setOrderList(OrderService.getValidatedOrder());

            //Print OrderDB-List
            OrderDB.listOrderList();
        } else {
            System.out.println("Software Error!");
        }
    }
}