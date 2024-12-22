package lesson7.service.impl;

import lesson7.domain.Order;
import lesson7.service.ReceivingOrder;
import lesson7.service.OrderHandle;
import lesson7.service.SaveOrder;
import lesson7.service.PreparingOrder;
import lesson7.service.DeliveryOrder;


public class OrderHandleImpl implements OrderHandle {

    private ReceivingOrder receiving;
    private SaveOrder db;
    private PreparingOrder notification;
    private DeliveryOrder delivery;

    public OrderHandleImpl(ReceivingOrder receiving, SaveOrder save, PreparingOrder notification, DeliveryOrder delivery) {
        this.receiving = receiving;
        this.db = save;
        this.notification = notification;
        this.delivery = delivery;
    }

    @Override
    public void register(Order order) {
        System.out.println("Step 1: receive order");

        receiving.orderReceivedBy(order);

        System.out.println("Step 2: save order to DB");

        db.save(order);

        System.out.println("Step 3: send notification");

        notification.preparing(order);

        System.out.println("Step 4: delivery order");

        delivery.delivered();

        System.out.println("End.");

    }

}
