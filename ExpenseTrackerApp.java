import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ExpenseTrackerApp {
    private ExpenseTracker tracker;
    private Scanner scanner;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    public ExpenseTrackerApp() {
        tracker = new ExpenseTracker();
        scanner = new Scanner(System.in);
    }
    
    /**
     * Display main menu and handle user choices
     */
    public void start() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("     WELCOME TO PERSONAL EXPENSE TRACKER");
        System.out.println("=".repeat(60));
        
        boolean running = true;
        while (running) {
            displayMenu();
            try {
                int choice = getIntInput();
                running = handleMenuChoice(choice);
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please try again.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Thank you for using Expense Tracker. Goodbye!");
        System.out.println("=".repeat(60) + "\n");
        scanner.close();
    }
    
    /**
     * Display menu options
     */
    private void displayMenu() {
        System.out.println("\n┌─── MAIN MENU ───────────────────┐");
        System.out.println("│ 1. Add New Expense              │");
        System.out.println("│ 2. View All Expenses            │");
        System.out.println("│ 3. Monthly Expense Report       │");
        System.out.println("│ 4. Category Analysis            │");
        System.out.println("│ 5. Highest Expense Category     │");
        System.out.println("│ 6. View Statistics              │");
        System.out.println("│ 7. Delete Expense               │");
        System.out.println("│ 0. Exit & Save                  │");
        System.out.println("└─────────────────────────────────┘");
        System.out.print("Enter your choice: ");
    }
    
    /**
     * Handle menu choice
     */
    private boolean handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addNewExpense();
                break;
            case 2:
                tracker.displayAllExpenses();
                break;
            case 3:
                generateMonthlyReport();
                break;
            case 4:
                tracker.displayCategoryAnalysis();
                break;
            case 5:
                tracker.findHighestExpenseCategory();
                break;
            case 6:
                displayStatistics();
                break;
            case 7:
                deleteExpense();
                break;
            case 0:
                tracker.saveExpenses();
                return false;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
        return true;
    }
    
    /**
     * Add a new expense with user input
     */
    private void addNewExpense() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("ADD NEW EXPENSE");
        System.out.println("-".repeat(50));
        
        try {
            System.out.print("Enter amount (Rs.): ");
            double amount = getDoubleInput();
            
            System.out.println("\nSelect category:");
            String[] categories = {"Food", "Transport", "Entertainment", "Shopping", 
                                   "Utilities", "Health", "Education", "Other"};
            for (int i = 0; i < categories.length; i++) {
                System.out.printf("  %d. %s\n", i + 1, categories[i]);
            }
            System.out.print("Enter category number: ");
            int catIndex = getIntInput() - 1;
            
            if (catIndex < 0 || catIndex >= categories.length) {
                System.out.println("Invalid category!");
                return;
            }
            String category = categories[catIndex];
            
            System.out.print("Enter date (dd-MM-yyyy): ");
            LocalDate date = getDateInput();
            
            System.out.print("Enter description (optional): ");
            String description = scanner.nextLine().trim();
            
            tracker.addExpense(amount, category, date, description);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /**
     * Generate monthly report
     */
    private void generateMonthlyReport() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("MONTHLY EXPENSE REPORT");
        System.out.println("-".repeat(50));
        
        System.out.print("Enter month (1-12): ");
        int month = getIntInput();
        System.out.print("Enter year (e.g., 2025): ");
        int year = getIntInput();
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
            return;
        }
        
        tracker.generateMonthlyReport(month, year);
    }
    
    /**
     * Display statistics
     */
    private void displayStatistics() {
        int count = tracker.getExpenseCount();
        if (count == 0) {
            System.out.println("\n*** No expenses recorded yet ***\n");
            return;
        }
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("EXPENSE STATISTICS");
        System.out.println("=".repeat(50));
        System.out.printf("Total Expenses: %d\n", count);
        System.out.printf("Total Amount: Rs.%.2f\n", tracker.getTotalExpenses());
        System.out.printf("Average Expense: Rs.%.2f\n", tracker.getAverageExpense());
        System.out.println("=".repeat(50) + "\n");
    }
    
    /**
     * Delete an expense
     */
    private void deleteExpense() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("DELETE EXPENSE");
        System.out.println("-".repeat(50));
        
        tracker.displayAllExpenses();
        
        if (tracker.getExpenseCount() == 0) {
            return;
        }
        
        System.out.print("Enter expense number to delete (0 to cancel): ");
        int index = getIntInput() - 1;
        
        if (index == -1) {
            System.out.println("Cancelled.");
            return;
        }
        
        tracker.deleteExpense(index);
    }
    
    /**
     * Get integer input from user
     */
    private int getIntInput() {
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return value;
    }
    
    /**
     * Get double input from user
     */
    private double getDoubleInput() {
        double value = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        return value;
    }
    
    /**
     * Get date input from user
     */
    private LocalDate getDateInput() throws DateTimeParseException {
        String dateStr = scanner.nextLine().trim();
        return LocalDate.parse(dateStr, formatter);
    }
    
    /**
     * Main method to start the application
     */
    public static void main(String[] args) {
        ExpenseTrackerApp app = new ExpenseTrackerApp();
        app.start();
    }
}
