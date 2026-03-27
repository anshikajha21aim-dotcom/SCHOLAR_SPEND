import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinanceManager manager = new FinanceManager();
        
        System.out.println("--- 🎓 Welcome to ScholarSpend ---");

        while (true) {
            System.out.println("\n1. Add Expense\n2. View Summary\n3. Exit");
            System.out.print("Select: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Fix for scanner bug

            if (choice == 1) {
                System.out.print("Description: "); String d = sc.nextLine();
                System.out.print("Amount: "); double a = sc.nextDouble();
                System.out.print("Category: "); String c = sc.next();
                manager.addExpense(new Expense(d, a, c));
            } else if (choice == 2) {
                manager.showExpenses();
                System.out.println("Total Spent: $" + manager.getTotalSpending());
            } else {
                break;
            }
        }
        sc.close();
    }
}
