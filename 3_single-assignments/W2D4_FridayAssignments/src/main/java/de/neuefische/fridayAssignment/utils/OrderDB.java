package de.neuefische.fridayAssignment.utils;

import de.neuefische.fridayAssignment.model.Order;
import de.neuefische.fridayAssignment.model.Product;

import java.util.ArrayList;
import java.util.Objects;

public class OrderDB {
    private ArrayList<Product> orderDB = new ArrayList<>();

    public OrderDB(ArrayList<Product> orderDB){
        this.orderDB = orderDB;
    }

    public Order list(){

    }

    public Order get(){

    }

    @Override
    public String toString() {
        return "OrderDB{" +
                "orderDB=" + orderDB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDB orderDB1 = (OrderDB) o;
        return Objects.equals(orderDB, orderDB1.orderDB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDB);
    }
}
