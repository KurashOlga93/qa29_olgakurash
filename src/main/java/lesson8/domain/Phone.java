package lesson8.domain;

public abstract class Phone {

    private String name;

    public String getName() {
        return name;
    }

    public Phone(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println("Get call number");;
    }

    public void play() {
        System.out.println("Play music");;
    }

    public abstract void firmware();
}