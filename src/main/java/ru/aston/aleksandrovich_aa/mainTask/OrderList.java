package ru.aston.aleksandrovich_aa.mainTask;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderList {
    private List<Order> orderList = new ArrayList<>();

    public List<Order> getOrderList() {
        return orderList;
    }

    public void showOrderList() {
        orderList.forEach(System.out::println);
    }

    public BigDecimal getTotalCost() {
        BigDecimal totalCost = new BigDecimal(0);
        for (Order order : orderList) {
            totalCost = totalCost.add(BigDecimal.valueOf(order.getAmount()));
        }
        return totalCost;
    }

    public void getSortedList() {
        System.out.println("Sorted by surname");
        System.out.println("-----------------");
        Collections.sort(orderList);
    }
}
