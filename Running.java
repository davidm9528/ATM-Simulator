import java.util.Scanner;

public class Running {

    static Account a1 = new Account("David", "Mackenzie", "Generic Bank LTD", 525, "Student Account", false, 49372012, 040004, 1234);
    static Account a2 = new Account("John", "Smith", "Generic Bank LTD", 468, "Student Account", true, 49503741, 040004, 5678);

    public static void main(final String[] args) {

        //Error - try catch always showing exception, fix!
     try {

            System.out.println("*** GENERIC CASH MACHINE ***");
            System.out.println("***PLEASE ENTER YOUR PIN BELOW***");
            System.out.println("(we will use your pin to identify which customer you are)");

            int attempts = 3;
            int p;

            final Scanner pinE = new Scanner(System.in);
            p = pinE.nextInt();

            while (p != a1.Pin && attempts > 0) {
                attempts--;
                System.out.println("Incorrect Pin. " + attempts + " attempts remaining");
                System.out.println("Enter your pin again:");
                p = pinE.nextInt();

                if (attempts == 1) {
                    System.out.println("Access Denied");
                    System.exit(0);
                }
            }

            System.out.println("Welcome back " + a1.FName + "!");
            attempts = 0;
            pinE.close();

            printMenu();

        } catch (final Exception e) {
            System.out.println("Error in code, whoops!");
        }

    }

    static public void printMenu() {
        System.out.println("--- Select an option below ---");
        System.out.println("1. Display balance");
        System.out.println("2. Withdraw with receipt");
        System.out.println("3. Without without receipt");
        System.out.println("4. Change pin");
        System.out.println("5. --- Cancel transaction ---");

        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        switch (choice) {
        case 1:
            System.out.println("Current balance: £" + a1.getBalance());
            break;
        default:
            break;
        }
    }

}
