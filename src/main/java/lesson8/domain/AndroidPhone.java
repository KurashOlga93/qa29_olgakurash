package lesson8.domain;

public class AndroidPhone extends Phone {

    public AndroidPhone(String name) {
        super(name);
    }

    @Override
    public void firmware() {
        System.out.println("Check Android version: 12");
    }
}