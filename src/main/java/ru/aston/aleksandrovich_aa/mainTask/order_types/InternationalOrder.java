package ru.aston.aleksandrovich_aa.mainTask.order_types;

import ru.aston.aleksandrovich_aa.mainTask.DiscountCategories;
import ru.aston.aleksandrovich_aa.mainTask.Order;
import ru.aston.aleksandrovich_aa.mainTask.User;

public class InternationalOrder extends Order {

    private boolean compartmentCarriage;
    private boolean promoCode;

    public InternationalOrder(int id, User user, int amount, boolean compartmentCarriage, boolean promoCode) {
        super(id, user, amount);
        this.compartmentCarriage = compartmentCarriage;
        this.promoCode = promoCode;
        if (this.compartmentCarriage) {
            setAmount(getAmount() * 3);
        }
        getDiscount();
    }

    public boolean isCompartmentCarriage() {
        return compartmentCarriage;
    }

    public boolean isPromoCode() {
        return promoCode;
    }

    @Override
    public void getDiscount() {
        if (promoCode) {
            setAmount((int) (getAmount() - (DiscountCategories.PROMO.getDiscount() * getAmount())));
        }
    }

    @Override
    public String toString() {
        return "Ticket info:\n" +
                "Compartment carriage: " + isCompartmentCarriage() + "\n" +
                "id: " + getId() + "\n"
                + getUser() +
                "Promo code: " + isPromoCode() + "\n" +
                "amount: " + getAmount();
    }
}
