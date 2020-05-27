package de.neuefische.springgroupproject1.service;

import de.neuefische.springgroupproject1.db.OrderDB;
import de.neuefische.springgroupproject1.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderDB orderDB;


    public OrderService(OrderDB orderDB) {
        this.orderDB = orderDB;
    }

    public List<Order> getOrderList(){
        return orderDB.getOrderList();
    }

    public void addOrder(Order order) {
        orderDB.addOrders(order);
    }
}
