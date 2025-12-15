
import java.util.Scanner;

// Interface
interface Bank {

    void deposit();

    void withdraw();

    void checkBalance();
}

// Class implementing the interface
class CodingalBank implements Bank {

    double balance = 1000;
    Scanner sc = new Scanner(System.in);

    public void deposit() {
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("✅ Deposit successful!");
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawal successful!");
        } else {
            System.out.println("❌ Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }
}

// Main class
public class MainBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CodingalBank bank = new CodingalBank();

        System.out.println("🏦 Welcome to Codingal Banking Services 🏦");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bank.deposit();
                break;
            case 2:
                bank.withdraw();
                break;
            case 3:
                bank.checkBalance();
                break;
            default:
                System.out.println("❌ Invalid choice!");
        }

        System.out.println("Thank you for using Codingal Banking Services 😊");
        sc.close();
    }
}
