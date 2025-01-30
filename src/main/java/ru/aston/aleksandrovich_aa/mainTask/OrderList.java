package ru.aston.aleksandrovich_aa.mainTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderList {
    private List<Order> orderList = new ArrayList<>();

    public List<Order> getOrderList() {
        return orderList;
    }

    public void showOrderList() {
        for (Order order : orderList) {
            System.out.println(order);
            System.out.println("-----------------");
        }
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (Order order : orderList) {
            totalCost += order.getAmount();
        }
        return totalCost;
    }

    public void getSortedList() {
        List<Order> sorted = orderList;
        sorted.sort(Comparator.comparing((Order::getUserSurname)));
        orderList = sorted;
        System.out.println("Sorted by surname");
        System.out.println("-----------------");
    }
}
