
class Animal { // Base class
    int age = 5;

    void eat() {
        System.out.println("Animals eat Food!");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal { // Sub class extending Base class

    Dog() {
        System.out.println("Dog object is Created!");
    }

    void bark() {
        System.out.println("Dogs Bark");
    }

}

class Husky extends Dog { // sub class extending sub class
    Husky() {
        System.out.println("Husky object is Created!");
    }

    void type() {
        System.out.println("Fur Type");
    }
}

class InheritanceDemo {

    public static void main(String[] args) {
        Husky leo = new Husky();
        leo.eat();
        leo.type();
    }

}