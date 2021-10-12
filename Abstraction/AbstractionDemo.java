
abstract class Animal {
    int age;

    abstract void bark();

    void sleep() {
        System.out.println("Animal is Sleeping...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks...");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Animal Husky = new Dog();
        Husky.sleep();
        Husky.bark();

    }
}
