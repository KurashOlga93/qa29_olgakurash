package lesson8.domain;

public class ApplePhone extends Phone {

    public ApplePhone(String name) {
        super(name);
    }

    @Override
    public void firmware() {
        System.out.println("Check IOS version: 18.5.1");
    }
}
