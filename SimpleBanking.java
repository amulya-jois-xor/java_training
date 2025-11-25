
//Abstraction
 
// Abstract class
abstract class BankAccount {
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

// SavingsAccount class
class SavingsAccount extends BankAccount {
    private double balance = 0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void showBalance() {
        System.out.println("Balance: $" + balance);
    }
}


public class SimpleBanking {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.deposit(1000);
        account.withdraw(500);
        account.showBalance();
    }
}
