

public class Bank {
    static int currentBalance = 1000;

    public static void greetCustomer() {
        System.out.println("hello, welcome to Banking Application");
    }

    public void deposit(int amount) {
        currentBalance = currentBalance + amount;
        System.out.println("amount deposited successfully");
    }

    public static void withdrawal(int amount) {
        currentBalance = currentBalance - amount; // fixed 'Amount' to 'amount'
        System.out.println("amount withdrawn successfully");
        // Note: should check if currentBalance >= amount before withdrawing
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public static void main(String[] args) {
        greetCustomer(); // fixed method name
        Bank bank = new Bank();
        bank.deposit(600);
        System.out.println("currentBalance is: " + bank.getCurrentBalance());
        Bank.withdrawal(300); // fixed method call + name
        System.out.println("currentBalance is: " + bank.getCurrentBalance());
    }
}