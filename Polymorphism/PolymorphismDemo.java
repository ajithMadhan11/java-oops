
class Animal {
    public void eat() {
        System.out.println("Method called from Class Animal");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Method called from class Dog");
    }
}

class Husky extends Dog {
    public void eat() {
        System.out.println("Method called from class Husky");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a1, a2, a3;
        a1 = new Animal();
        a1.eat();
        a2 = new Dog();
        a2.eat(); // Run time Polymorphism
        a3 = new Husky();
        a3.eat(); // Run time Polymorphism
    }
}
