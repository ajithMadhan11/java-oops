import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User a = new User();
        a.setName("Ajithmadhan");
        a.setUserId(121);
        boolean exit = false;

        while (!exit) {
            System.out.println("Select an option to continue!");
            System.out.println("1. View Account details");
            System.out.println("2. Withdraw amount");
            System.out.println("3. Deposit amount");
            System.out.println("4. Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("--------User Account details-------");
                    System.out.println("Account number:      " + a.getId());
                    System.out.println("Account holder name: " + a.getName());
                }
                    break;
                case 2: {
                    System.out.println("Enter amount to withdraw");
                    int amount = scanner.nextInt();
                    a.withdraw(amount);

                    System.out.println("Your balance is " + a.viewBalance());
                }
                    break;
                case 3: {
                    System.out.println("Enter amount to Deposit");
                    int amount = scanner.nextInt();
                    a.deposit(amount);
                    System.out.println("Amount Creditted successfully");
                    System.out.println("Your balance is " + a.viewBalance());
                }
                    break;
                case 4: {
                    System.out.println("Thank you for using our service");
                    exit = true;
                }
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }

        }
    }
}