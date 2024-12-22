package lesson7.domain;

public class Order {

    private String food;

    private String drinks;

    private int orderNumber;


    public Order(String food, String drinks, int orderNumber) {
        this.food = food;
        this.drinks = drinks;
        this.orderNumber = orderNumber;
    }

    public String getFood() {
        return food;
    }

    public String getDrinks() {
        return drinks;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

}
