public class Expense {
    private String description;
    private double amount;
    private String category;

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    // This converts the object into a readable string for the menu
    @Override
    public String toString() {
        return String.format("[%s] %-15s | $%.2f", category, description, amount);
    }

    // Getters
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
}