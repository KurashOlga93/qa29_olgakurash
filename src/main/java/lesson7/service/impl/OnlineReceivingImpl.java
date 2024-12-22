package lesson7.service.impl;

import lesson7.domain.Order;
import lesson7.service.ReceivingOrder;

public class OnlineReceivingImpl implements ReceivingOrder {

    @Override
    public void orderReceivedBy(Order order) {

        System.out.println("Receiving online");

    }
}
