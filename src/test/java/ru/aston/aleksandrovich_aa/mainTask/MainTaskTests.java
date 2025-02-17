package ru.aston.aleksandrovich_aa.mainTask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTaskTests extends BaseTest{

    @Test
    @DisplayName("Create orders, order list and total cost")
    public void test1() {
        System.out.println("Total cost of tickets: " + orderList.getTotalCost());
    }

    @Test
    @DisplayName("Create orders, order list and sorting this list")
    public void test2() {
        orderList.showOrderList();
        orderList.getSortedList();
        orderList.showOrderList();
    }
}
