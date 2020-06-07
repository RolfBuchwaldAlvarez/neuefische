package de.neuefische.springgroupproject1.db;

import de.neuefische.springgroupproject1.model.Order;
import de.neuefische.springgroupproject1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDB {

    private final List<Order> orderList = new ArrayList<>(List.of(

            new Order("1",List.of( new Product("1","Caprese"), new Product("3", "Tonno"))),
            new Order("2",List.of( new Product("2","Cipolla"), new Product("3", "Tonno"))),
            new Order("3",List.of( new Product("1","Caprese"), new Product("2", "Cipolla"), new Product("4", "Prosciutto")))
    ));

    public void addOrders(Order order) {
        this.orderList.add(order);
    }

    public List<Order> getOrderList(){
        return orderList;
    }

    public void clearDB(){
        orderList.clear();
    }

}
