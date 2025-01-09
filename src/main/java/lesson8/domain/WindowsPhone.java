package lesson8.domain;

public class WindowsPhone extends Phone{

    public WindowsPhone(String name) {
        super(name);
    }

    @Override
    public void firmware() {
        System.out.println("Check WindowsPhone version: 13.2.1");
    }

    @Override
    public void call() {
        System.out.println("Call from Windows phone");
    }
}
