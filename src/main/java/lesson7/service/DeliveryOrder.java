package lesson7.service;

import lesson7.domain.Order;

public interface DeliveryOrder {

    default void delivered(){
        System.out.println("Your order is not delivered to your home. You can pick it up at the pick-up window");
    }
}
