package lesson7.service.impl;

import lesson7.domain.Order;
import lesson7.service.ReceivingOrder;

public class PhoneReceivingImpl implements ReceivingOrder {

    @Override
    public void orderReceivedBy(Order order) {

        System.out.println("Receiving order by phone");

    }
}
