import java.util.Scanner;

public class ICICIbank extends Bank {

    @Override
    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to Withdraw: ");
        int amt = sc.nextInt();
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn " + amt + " successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
        System.out.println("Your current Balance is: " + balance);
    }

    @Override
    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to Deposit: ");
        int amt = sc.nextInt();
        balance += amt;
        System.out.println("Deposited " + amt + " successfully.");
        System.out.println("Your current Balance is: " + balance);
    }
}
