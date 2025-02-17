package ru.aston.aleksandrovich_aa.mainTask;

import org.junit.jupiter.api.BeforeEach;
import ru.aston.aleksandrovich_aa.mainTask.order_types.InternationalOrder;
import ru.aston.aleksandrovich_aa.mainTask.order_types.SuburbanOrder;

public class BaseTest {

    protected OrderList orderList = new OrderList();

    @BeforeEach
    public void setUp() {
        User user1 = new User("Семен", "Яковлев", 25);
        User user2 = new User("Анастасия", "Бублик", 70);
        User user3 = new User("Валерий", "Журавлев", 12);

        SuburbanOrder suburbanOrder1 = new SuburbanOrder(101, user1, 200, true);
        SuburbanOrder suburbanOrder2 = new SuburbanOrder(103, user3, 200, false);

        InternationalOrder internationalOrder1 = new InternationalOrder(102, user2, 400, true, true);

        orderList.getOrderList().add(suburbanOrder1);
        orderList.getOrderList().add(suburbanOrder2);
        orderList.getOrderList().add(internationalOrder1);
    }
}
