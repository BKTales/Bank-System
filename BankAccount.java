import java.util.Scanner;

public class BankAccount
{
    double balance;
    double prevTransaction;
    String customerName;
    String customerId;
    BankAccount(String customerName, String customerId)
    {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    double deposit(double amount)
    {
        if(amount != 0){
            balance += amount;
            amount = prevTransaction;
        }
        return balance;
    }
    double withdraw(double amount){
        if(amount != 0){
            balance -= amount;
            prevTransaction = -amount;
        }
        return balance;
    }
        void menu()
    {
        char option = ' ';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your bank ID: " + customerId);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");

        do {
            System.out.println("Choose an option:");
            option=scanner.next().charAt(0);
            System.out.println("\n");

            switch (option){

                case 'a':
                    System.out.println("****************************");
                    System.out.println("Balance: " + balance);
                    System.out.println("****************************");
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("****************************");
                    System.out.println("How much money do you want to deposit?");
                    System.out.println("****************************");
                    double amount = scanner.nextDouble();
                    System.out.println("\n");
                    deposit(amount);
                    break;
                case 'c':
                    System.out.println("****************************");
                    System.out.println("How much money do you want to withdraw?");
                    System.out.println("****************************");
                    amount = scanner.nextDouble();
                    withdraw(amount);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("****************************");
                    System.out.println("Your previous transaction was " + prevTransaction);
                    System.out.println("****************************");
                    System.out.println("\n");
                    break;
                case 'e':
                    break;
                default:
                    System.out.println("****************************");
                    System.out.println("Please choose a valid option.");
                    System.out.println("****************************");
                    System.out.println("\n");
                    break;
            }
        }while (option != 'e');
        System.exit(0);
    }
}
