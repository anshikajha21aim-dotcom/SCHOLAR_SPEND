public class Expense {
    private String description;
    private double amount;
    private String category;

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    // THIS IS THE MISSING PIECE!
    public String toFileFormat() {
        return description + "," + amount + "," + category;
    }

    @Override
    public String toString() {
        // Formats the output nicely: [Category] Description | $Amount
        return String.format("[%s] %-15s | $%.2f", category, description, amount);
    }

    public double getAmount() { 
        return amount; 
    }
}