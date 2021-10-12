public class User {
    private int userId;
    private String name;
    int balance;

    User() {
        this.balance = 10000;
    }

    void setName(String name) {
        this.name = name;
    }

    void setUserId(int id) {
        this.userId = id;
    }

    int getId() {
        return this.userId;
    }

    String getName() {
        return this.name;
    }

    int viewBalance() {
        return this.balance;
    }

    void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("You don't have sufficient balance");
            return;
        }
        this.balance = this.balance - amount;
        System.out.println("Amount withdrawed successfully");

    }

    void deposit(int amount) {
        this.balance = this.balance + amount;
    }

}