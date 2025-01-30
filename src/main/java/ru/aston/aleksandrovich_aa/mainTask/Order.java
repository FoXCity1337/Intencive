package ru.aston.aleksandrovich_aa.mainTask;

public abstract class Order implements Discount {

    private int id;
    private User user;
    private int amount;

    public Order(int id, User user, int amount) {
        this.id = id;
        this.user = user;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUserSurname() {
        return user.getSurname();
    }
}
