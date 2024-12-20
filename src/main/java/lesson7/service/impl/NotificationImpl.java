package lesson7.service.impl;

import lesson7.domain.Order;
import lesson7.service.PreparingOrder;

public class NotificationImpl implements PreparingOrder {

    @Override
    public void preparing(Order order) {

        System.out.println("Your order is preparing... Please, wait.");
    }
}
