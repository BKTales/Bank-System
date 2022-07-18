import java.util.Scanner;

public class BankSystem
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 'Name' and 'CostumerID': ");
        String costumerName = scanner.nextLine();
        String costumerId = scanner.nextLine();
        BankAccount obj1 = new BankAccount(costumerName, costumerId);
        obj1.menu();
    }
}

