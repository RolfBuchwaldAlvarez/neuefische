package de.neuefische.fridayAssignment.model;

import java.util.ArrayList;
import java.util.Objects;

public class Order {
    private int orderID;
    private ArrayList<Product> order;
    private static int orderCounter = 0;

    public Order(int orderID, ArrayList<Product> order) {
        this.orderID = orderID;
        this.order = order;
        this.orderCounter++;
    }

    public void listOrder() {
        System.out.println("Order-No.: " + getOrderID());
        for (int i = 0; i < getOrder().size(); i++) {
            System.out.println("Ordered Products: " + getOrder().get(i).getName());
        }
        System.out.println();
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public ArrayList<Product> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Product> order) {
        this.order = order;
    }

    public static int getCounter() {
        return orderCounter;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", products='" + order + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderID == order.orderID &&
                Objects.equals(order, order.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, order);
    }
}
