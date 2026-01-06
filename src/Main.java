import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;

class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account number: ");
        int numAccount = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String nameAccount = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        String initialDeposit = sc.nextLine();
        double balance = 0;
        //métod equalsIgnoreCase compara duas strings ignorando maisculas e minusculas
        if (initialDeposit.equalsIgnoreCase("y")) {
            System.out.println("Enter initial deposit value: ");
            balance = sc.nextDouble();
        }

        RegisterAccount p1 = new RegisterAccount(numAccount, nameAccount, initialDeposit, balance);

        System.out.println("Account data: ");
        System.out.printf(
                "Account %d Holder: %s Balance: %.2f%n",
                p1.getNumAccount(),
                p1.getNameAccount(),
                p1.getBalance()
        );

        //deposito
        System.out.println("Enter a deposit value: ");
        double newDeposit = sc.nextDouble();
        p1.Deposit(newDeposit);
        System.out.println("Account data: ");
        System.out.printf(
                "Account %d Holder: %s Balance: %.2f%n",
                p1.getNumAccount(),
                p1.getNameAccount(),
                p1.getBalance()
        );

        //saque
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        p1.Withdraw(withdrawValue);
        System.out.println("Account data: ");
        System.out.printf(
                "Account %d Holder: %s Balance: %.2f%n",
                p1.getNumAccount(),
                p1.getNameAccount(),
                p1.getBalance()
        );;
    }
}