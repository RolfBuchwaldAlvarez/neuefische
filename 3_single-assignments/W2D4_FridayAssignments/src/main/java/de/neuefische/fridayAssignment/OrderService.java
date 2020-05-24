package de.neuefische.fridayAssignment;

import de.neuefische.fridayAssignment.model.Order;
import de.neuefische.fridayAssignment.utils.ProductDB;

import java.util.ArrayList;
import java.util.Objects;

public class OrderService {

    private static ArrayList<Order> validatedOrder = new ArrayList<>();

    public static boolean addOrder(Order newOrder, ProductDB productDB){
       int counter = 0;
        for(int i = 0; i < newOrder.getOrder().size(); i++) {
            for(int j = 0; j < productDB.getProductList().size(); j++) {
                if(newOrder.getOrder().get(i).getID() == productDB.getProductList().get(j).getID()){
                    counter++;
                }
            }
        }
        System.out.println("Counter: " + counter);
        System.out.println("Expected: " + newOrder.getOrder().size());
        if (counter == newOrder.getOrder().size()){
            System.out.println("valid");
            ArrayList<Order> transitionArray = new ArrayList<>();
            transitionArray.add(newOrder);
            setValidatedOrder(transitionArray);
            System.out.println(validatedOrder);
            System.out.println();
            return true;
        } else {
            System.out.println("Invalid Order!");
            return false;
        }
    }

    public static void listOrder(){
        for (Object allOrder : validatedOrder) {
            System.out.println(allOrder);
        }
    }

    public static ArrayList<Order> getValidatedOrder() {
        return validatedOrder;
    }

    public static void setValidatedOrder(ArrayList<Order> transitionArray){
        validatedOrder = transitionArray;
    }

    @Override
    public String toString() {
        return "OrderService{" +
                "validatedOrder=" + validatedOrder +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderService that = (OrderService) o;
        return Objects.equals(validatedOrder, that.validatedOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validatedOrder);
    }
}
