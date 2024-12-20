package lesson7;

import lesson7.domain.Order;
import lesson7.service.OrderHandle;
import lesson7.service.impl.*;


public class MainApp {

    public static void main(String[] args) {

        Order order = new Order("burger", "cola", 543);

        OrderHandle handler = new OrderHandleImpl(
                new PhoneReceivingImpl(),
                new SaveOrderImpl(),
                new NotificationImpl(),
                new NotDeliveryImpl());

        handler.register(order);
    }
}
