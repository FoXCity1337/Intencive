package ru.aston.aleksandrovich_aa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.aston.aleksandrovich_aa.mainTask.OrderList;
import ru.aston.aleksandrovich_aa.mainTask.User;
import ru.aston.aleksandrovich_aa.mainTask.order_types.InternationalOrder;
import ru.aston.aleksandrovich_aa.mainTask.order_types.SuburbanOrder;

public class MainTaskTests {

    @Test
    @DisplayName("Create orders, order list and total cost")
    public void test1() {
        User user1 = new User("Семен", "Яковлев", 25);
        User user2 = new User("Анастасия", "Бублик", 70);
        User user3 = new User("Валерий", "Журавлев", 12);

        SuburbanOrder suburbanOrder1 = new SuburbanOrder(101, user1, 200, true);
        SuburbanOrder suburbanOrder2 = new SuburbanOrder(103, user3, 200, false);

        InternationalOrder internationalOrder1 = new InternationalOrder(102, user2, 400, true, true);

        OrderList orderList = new OrderList();
        orderList.getOrderList().add(suburbanOrder1);
        orderList.getOrderList().add(suburbanOrder2);
        orderList.getOrderList().add(internationalOrder1);

        System.out.println("Total cost of tickets: " + orderList.getTotalCost());
    }

    @Test
    @DisplayName("Create orders, order list and sorting this list")
    public void test2() {
        User user1 = new User("Семен", "Яковлев", 25);
        User user2 = new User("Анастасия", "Бублик", 70);
        User user3 = new User("Валерий", "Журавлев", 12);

        SuburbanOrder suburbanOrder1 = new SuburbanOrder(101, user1, 200, true);
        SuburbanOrder suburbanOrder2 = new SuburbanOrder(103, user3, 200, false);

        InternationalOrder internationalOrder1 = new InternationalOrder(102, user2, 400,
                true, true);

        OrderList orderList = new OrderList();
        orderList.getOrderList().add(suburbanOrder1);
        orderList.getOrderList().add(suburbanOrder2);
        orderList.getOrderList().add(internationalOrder1);

        orderList.showOrderList();
        orderList.getSortedList();
        orderList.showOrderList();
    }
}
