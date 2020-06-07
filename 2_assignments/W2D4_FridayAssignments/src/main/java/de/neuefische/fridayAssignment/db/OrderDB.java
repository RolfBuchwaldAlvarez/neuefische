package de.neuefische.fridayAssignment.db;

import de.neuefische.fridayAssignment.model.Order;

import java.util.ArrayList;
import java.util.Objects;

public class OrderDB {
    private static ArrayList<ArrayList<Order>> orderList = new ArrayList<>();

    public static void listOrderList() {
        System.out.println("Orders saved in list:");
            for (int i = 0; i < getOrderList().size(); i++) {
                System.out.println(orderList.get(i));
        }
        System.out.println();
    }

    public static ArrayList<ArrayList<Order>> getOrderList(){
        return orderList;
    }

    public static void setOrderList(ArrayList<Order> validatedOrder){
        orderList.add(validatedOrder);
    }

    @Override
    public String toString() {
        return "OrderDB{" +
                "orderDB=" + orderList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDB orderDB1 = (OrderDB) o;
        return Objects.equals(orderList, orderDB1.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderList);
    }
}
