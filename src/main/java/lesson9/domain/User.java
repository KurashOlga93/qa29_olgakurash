package lesson9.domain;

public class User {

    private final String name;

    private int balance;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
}