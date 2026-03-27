import java.util.ArrayList;

public class FinanceManager {
    private ArrayList<Expense> expenses;

    public FinanceManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense e) {
        expenses.add(e);
        System.out.println("✅ Expense added successfully!");
    }

    public void showExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("📭 No expenses recorded yet.");
            return;
        }
        System.out.println("\n--- 💸 Expense History ---");
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public double getTotalSpending() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }
}