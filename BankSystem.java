import java.util.Scanner;

public class BankSystem
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 'Name' and 'CostumerID' ");
        String costumerName = scanner.nextLine();
        String costumerId = scanner.nextLine();
        menu(costumerName, costumerId);
    }
    private static void menu(String costumerName, String costumerId)
    {
        char option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + costumerName);
        System.out.println("Your bank ID: " + costumerId);
    }
}

