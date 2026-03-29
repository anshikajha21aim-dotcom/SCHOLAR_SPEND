import java.util.ArrayList;

public class FinanceManager {
    private ArrayList<Expense> expenses;
    private final double MONTHLY_BUDGET = 1000.0; 

    public FinanceManager() {
        this.expenses = FileHandler.loadFromFile();
    }

    // NEW: Check if the new item fits in the remaining budget
    public boolean canAfford(double amount) {
        return (getTotalSpending() + amount) <= MONTHLY_BUDGET;
    }

    public double getRemainingBudget() {
        return MONTHLY_BUDGET - getTotalSpending();
    }

    public void addExpense(Expense e) {
        expenses.add(e);
        FileHandler.saveToFile(expenses);
        System.out.println("Expense tracked successfully!");
    }

    public void showSummary() {
        if (expenses.isEmpty()) {
            System.out.println("No data yet.");
            return;
        }
        System.out.println("\n--- EXPENSE HISTORY ---");
        for (Expense e : expenses) {
            System.out.println(e);
        }
        System.out.println("--------------------------");
        System.out.println("Total Spent: $" + getTotalSpending());
        System.out.println("Remaining:   $" + getRemainingBudget());
    }

    public double getTotalSpending() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }
}
