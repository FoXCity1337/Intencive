package ru.aston.aleksandrovich_aa.mainTask;

public enum DiscountCategories {
    CHILD(0.25),
    PENSIONER(0.20),
    PROMO(0.15);

    private double discount;

    DiscountCategories(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
