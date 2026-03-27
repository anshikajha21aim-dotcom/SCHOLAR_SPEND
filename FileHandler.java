import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private static final String FILE_NAME = "expenses.txt";

    public static void saveToFile(ArrayList<Expense> expenses) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Expense e : expenses) {
                writer.println(e.toFileFormat());
            }
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static ArrayList<Expense> loadFromFile() {
        ArrayList<Expense> expenses = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) return expenses;

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                String[] data = reader.nextLine().split(",");
                if (data.length == 3) {
                    expenses.add(new Expense(data[0], Double.parseDouble(data[1]), data[2]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No saved data found.");
        }
        return expenses;
    }
}