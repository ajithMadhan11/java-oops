
class Account {
    private int acc_no;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(int number) {
        this.acc_no = number;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return acc_no;
    }

}

public class EncapsulationTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAccountNumber(123);
        a1.setName("Ajith");

        System.out.println("Account no: " + a1.getAccountNumber() + " Account Holder Name: " + a1.getName());

    }
}
