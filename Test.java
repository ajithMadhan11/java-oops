// abstract class Animal {
//     abstract void callme();

//     abstract void callDog();

//     void callmee() {
//         System.out.println("calling me");

//     }
// }

// class Cat extends Animal {
//     public void callme() {
//         System.out.println("in Cat");
//     }

//     public void callDog() {
//         System.out.println("in Dg");

//     }
// }
// interface A {
//     abstract public void c();
// }

// abstract class B implements A {
//     abstract public void c();
// }

// class D extends B {
//     public void c() {
//         System.out.println("In BBBBBBB");
//     }
// }

class Vehicle {
    // defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Creating a child class
class Bike2 extends Vehicle {
    // defining the same method as in the parent class
    void run() {
        // super.run();
        System.out.println("Bike is running safely");
    }

}

public class Test {
    public static void main(String[] args) {
        Bike2 obj = new Bike2();// creating object
        obj.run();// calling method
    }
}
