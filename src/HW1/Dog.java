package HW1;

public class DOG extends Animal {
    public DOG(String name, String color) {
        super(name, color, 4);
    }

    public DOG(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void fly() {
    }
}