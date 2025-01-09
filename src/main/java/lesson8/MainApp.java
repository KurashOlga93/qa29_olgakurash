package lesson8;

import lesson8.domain.AndroidPhone;
import lesson8.domain.ApplePhone;
import lesson8.domain.Phone;
import lesson8.domain.WindowsPhone;
import lesson8.service.PhoneService;

public class MainApp {

    public static void main(String[] args) {

        Phone applePhone = new ApplePhone("Iphone");

        Phone androidPhone = new AndroidPhone("Android");

        Phone windowsPhone = new WindowsPhone("Windows");

        PhoneService phoneService = new PhoneService();

        phoneService.check(applePhone);

        System.out.println();

        phoneService.check(androidPhone);

        System.out.println();

        phoneService.check(windowsPhone);

        System.out.println();


        Phone phone = new Phone("Vertu") {
            @Override
            public void firmware() {
                System.out.println("Check Vertu version: 20");
            }
        };

        phoneService.check(phone);

    }
}
