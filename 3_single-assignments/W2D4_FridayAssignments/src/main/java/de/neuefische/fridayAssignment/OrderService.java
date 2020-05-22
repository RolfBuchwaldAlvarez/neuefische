package de.neuefische.fridayAssignment;

import de.neuefische.fridayAssignment.model.Order;
import de.neuefische.fridayAssignment.utils.OrderDB;
import de.neuefische.fridayAssignment.utils.ProductDB;

import java.util.ArrayList;
import java.util.Objects;

public class OrderService {

    private ArrayList<Order> allOrders = new ArrayList<>();

    public Order addOrder(Order newOrder, ProductDB productDB){
        if (productDB.)
        allOrders.add(newOrder);
        return newOrder;
    }

    public void listOrder(){
        for (Object allOrder : allOrders) {
            System.out.println(allOrder);
        }
    }

    @Override
    public String toString() {
        return "OrderService{" +
                "allOrders=" + allOrders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderService that = (OrderService) o;
        return Objects.equals(allOrders, that.allOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allOrders);
    }
}
