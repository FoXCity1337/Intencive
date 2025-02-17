package ru.aston.aleksandrovich_aa.mainTask.order_types;

import ru.aston.aleksandrovich_aa.mainTask.DiscountCategories;
import ru.aston.aleksandrovich_aa.mainTask.Order;
import ru.aston.aleksandrovich_aa.mainTask.User;

import java.math.BigDecimal;

public class SuburbanOrder extends Order {

    private boolean businessClass;

    public SuburbanOrder(int id, User user, int amount, boolean businessClass) {
        super(id, user, amount);
        this.businessClass = businessClass;
        getDiscount();
        if (this.businessClass) {
            setAmount(getAmount() * 2);
        }
    }

    @Override
    public void getDiscount() {
        if (getUser().getAge() < 14) {
            setAmount((int) (getAmount() - (getAmount() * DiscountCategories.CHILD.getDiscount())));
        }
        if (getUser().getAge() > 65) {
            setAmount((int) (getAmount() - (getAmount() * DiscountCategories.PENSIONER.getDiscount())));
        }
    }

    @Override
    public String toString() {
        return "Ticket info:\n" +
                "id: " + getId() + "\n"
                + getUser()
                + "amount: " + getAmount() + "\n"
                + "-----------------";
    }
}
