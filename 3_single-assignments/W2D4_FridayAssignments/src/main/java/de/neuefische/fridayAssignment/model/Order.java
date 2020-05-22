package de.neuefische.fridayAssignment.model;

import de.neuefische.fridayAssignment.interfaces.ID;

import java.util.ArrayList;
import java.util.Objects;

public class Order {
    private int id;
    private ArrayList<Product> order;
    private static int counter = 0;

    public Order(int id, ArrayList<Product> order) {
        this.id = id;
        this.order = order;
        this.counter++;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public ArrayList<Product> getProducts() {
        return order;
    }

    public void setProducts(ArrayList<Product> order) {
        this.order = order;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products='" + order + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                Objects.equals(order, order.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, order);
    }
}
