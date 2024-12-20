package lesson7.service.impl;

import lesson7.service.DeliveryOrder;

public class DeliveryImpl implements DeliveryOrder {

    @Override
    public void delivered() {

        System.out.println("The order will be delivered to your home.");
    }
}

