import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {
    private String ch;

    public void insertCard(Bank bank) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("\nPlease choose a service: Deposit or Withdraw");
            System.out.print("Type here: ");
            String task = reader.readLine();

            switch(task.toLowerCase()) {
                case "deposit":
                    bank.deposit();
                    break;
                case "withdraw":
                    bank.withdraw();
                    break;
                default:
                    System.out.println("Invalid service selected.");
            }

            System.out.print("Type 'Stop' to exit or press Enter to continue with the same bank: ");
            ch = reader.readLine();
        } while (!ch.equalsIgnoreCase("Stop"));
    }
}
