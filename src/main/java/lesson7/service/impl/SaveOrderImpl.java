package lesson7.service.impl;

import lesson7.domain.Order;
import lesson7.service.SaveOrderToDB;

public class SaveOrderImpl implements SaveOrderToDB {

    @Override
    public void save(Order order) {
        System.out.println("Order with number " + order.getOrderNumber() + " saved successfully.");
    }
}
