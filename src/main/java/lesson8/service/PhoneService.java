package lesson8.service;

import lesson8.domain.Phone;

public class PhoneService {

    public void check(Phone phone) {
        System.out.println("Start the phone checking for: " + phone.getName());
        phone.call();
        phone.play();
        phone.firmware();
    }

}