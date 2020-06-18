package de.neuefische.springgroupproject1.db;

import de.neuefische.springgroupproject1.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDB {

    private final List<Order> orderList = new ArrayList<>();

    public void addOrders(Order order) {
        this.orderList.add(order);
    }

    public Order getOrderByID(String id) {
        for (Order order : orderList) {
            if(order.getId().equals(id)){
                return order;
            }
        }
        return null;
    }

}
