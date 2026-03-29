import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinanceManager manager = new FinanceManager();

        while (true) {
            System.out.println("\n--- ScholarSpend v1.1 ---");
            System.out.println("1. Add Expense\n2. View Summary\n3. Exit");
            System.out.print("Action: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("What did you buy? "); String desc = sc.nextLine();
                System.out.print("Cost: "); double amt = sc.nextDouble();
                System.out.print("Category: "); String cat = sc.next();

                // NEW: Logic to block overflow
                if (manager.canAfford(amt)) {
                    manager.addExpense(new Expense(desc, amt, cat));
                } else {
                    System.out.println("\n TRANSACTION DENIED!");
                    System.out.println("Reason: This item ($" + amt + ") exceeds your remaining budget of $" + manager.getRemainingBudget());
                    System.out.println("Try a cheaper alternative or wait for next month.");
                }

            } else if (choice == 2) {
                manager.showSummary();
            } else if (choice == 3) {
                System.out.println("Session saved. Goodbye!");
                break;
            }
        }
        sc.close();
    }
}
