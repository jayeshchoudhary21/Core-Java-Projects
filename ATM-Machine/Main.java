import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AtmOperationImpl op = new AtmOperationImpl();
        

        int atmnumber = 12345;
        int atmpin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");

        System.out.print("Enter ATM Number: ");
        int atmNumber = in.nextInt();
        System.out.print("Enter ATM Pin: ");
        int pin = in.nextInt();

        // Validation
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            // System.out.println("Validation Successful");
            while (true) {
                System.out.println(
                        "1. View Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Mini Statement\n5. Exit");

                System.out.print("Enter Choice: ");
                int ch = in.nextInt();
                if (ch == 1) {
                    op.viewBalance();
                } else if (ch == 2) {
                    System.out.println("Enter Amount to Withdraw: ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch == 3) {
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = in.nextDouble(); // 5000
                    op.depositAmount(depositAmount);
                } else if (ch == 4) {
                    op.viewMiniStatement();
                } else if (ch == 5) {
                    System.out.println("Collect your ATM Card\nThank you for using ATM Machine");
                    System.exit(0);
                    
                } else {
                    System.out.println("Please enter correct choice");
                }
            }
        } else {
            System.out.println("Incorrect ATM Number or Pin");
        }

    }
}