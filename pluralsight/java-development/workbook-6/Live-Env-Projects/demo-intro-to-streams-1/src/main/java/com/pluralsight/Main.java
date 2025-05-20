package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();

        Order order1 = new Order(123, "Ray");
        order1.addItem(new LineItem(11, "Potato", 2, 2));
        order1.addItem(new LineItem(12, "Tomato", 1, 2));
        allOrders.add(order1);

        Order order2 = new Order(456, "Durante");
        order2.addItem(new LineItem(13, "Fries", 10, 500));
        order2.addItem(new LineItem(14, "Cheese Cake", 4, 1000));
        allOrders.add(order2);

        Order order3 = new Order(365, "Potato Sensei");
        order3.addItem(new LineItem(15, "Water", 3, 50));
        order3.addItem(new LineItem(16, "Butter", 2, 30));
        allOrders.add(order3);

        Order order4 = new Order(365, "Potato Sensei");
        order4.addItem(new LineItem(17, "Corny Potato Joke Book", 3, 1));
        allOrders.add(order4);

        List<Order> impulseOrders = new ArrayList<>();

        for (Order order : allOrders) {
            if (order.getTotal() < 25) {
                impulseOrders.add(order);
            }
        }

        for (Order impulseOrder : impulseOrders) {
            System.out.println(impulseOrder);
        }

        double salesTotalAllOrder = 0;

        for (Order order : allOrders) {
            salesTotalAllOrder += order.getTotal();
        }

        System.out.println("Total: $" + salesTotalAllOrder);
    }
}
