import java.util.Scanner;

public class Running {

    static public void DepositCash(){
        System.out.println("How much would you like to deposit? (min/max - £5/£250)");
        System.out.printf("£"); int deposit = d.nextInt();
    }

    static public void WithdrawCash(){
        System.out.println("How much would you like to withdraw? (min/max - £5/£250)");
        System.out.printf("£"); int Withdraw = w.nextInt();
        // Withdraw from balance, end;
    }

    static public void WithdrawCashR(){
        System.out.println("How much would you like to withdraw? (min/max - £5/£250)");
        // Withdraw from balance with receipt (showing amount withdrawn/time/date);
    }

    static public void ChangePin(){
        System.out.println("Please enter the new 4-digit pin combination you would like to use in future: ");
        // Enter new digit (check 4 int digits);
        // change object.Pin;
        // save new pin to object relevant
    }

    static Scanner w = new Scanner(System.in);
    static Scanner d = new Scanner(System.in);

    static Account a1 = new Account("David", "Mackenzie", "Generic Bank LTD", 525, "Student Account", false, 49372012, 040004, 1234);
    static Account a2 = new Account("John", "Smith", "Generic Bank LTD", 468, "Student Account", true, 49503741, 040004, 5678);

    public static void main(String[] args) {
      
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

                if (attempts == 0) {
                    System.out.println("Access Denied");
                    System.exit(0);
                }
            }

            System.out.println("Welcome back " + a1.FName + "!");
            attempts = 0;
            printMenu();

    }

    static public void printMenu() {
        System.out.println("--- Select an option below ---");
        System.out.println("1. Display balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw with receipt");
        System.out.println("4. Without without receipt");
        System.out.println("5. Change pin");
        System.out.println("6. --- Cancel transaction ---");

        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        while (choice < 1 || choice > 6) {
            System.out.println("*Enter a valid choice from the menu*");
            choice = input.nextInt();
        }

        while (choice > 0 && choice < 7) {

            switch (choice) {
            case 1:
                System.out.println("Current balance: £" + a1.getBalance());
                choice = 0;
                break;

            case 2:
            DepositCash();
                choice = 0;
                break;

            case 3:
            WithdrawCashR();
                choice = 0;
                break;

            case 4:
            WithdrawCash();
                choice = 0;
                break;

            case 5:
            ChangePin();
                choice = 0;
                break;

            case 6:
                System.out.println("Ending transaction...");
                choice = 0;
                break;

            default:
            System.out.println("Default");
                choice = 0;
                break; 
            }

        }
        //close scanner
        input.close(); 
       
        d.close();
        w.close();
    }
}


