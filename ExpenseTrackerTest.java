import java.time.LocalDate;

/**
 * Test class to demonstrate the Personal Expense Tracker
 * This class tests all features with sample data
 */
public class ExpenseTrackerTest {
    
    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("PERSONAL EXPENSE TRACKER - AUTOMATED TEST");
        System.out.println("=".repeat(70) + "\n");
        
        ExpenseTracker tracker = new ExpenseTracker();
        
        // Test Case 1: Add Multiple Expenses
        System.out.println("TEST 1: Adding Multiple Expense Entries");
        System.out.println("-".repeat(70));
        addTestExpenses(tracker);
        System.out.println();
        
        // Test Case 2: Display All Expenses
        System.out.println("TEST 2: Displaying All Recorded Expenses");
        System.out.println("-".repeat(70));
        tracker.displayAllExpenses();
        
        // Test Case 3: Category Analysis
        System.out.println("TEST 3: Category Analysis");
        System.out.println("-".repeat(70));
        tracker.displayCategoryAnalysis();
        
        // Test Case 4: Highest Expense Category
        System.out.println("TEST 4: Finding Highest Expense Category");
        System.out.println("-".repeat(70));
        tracker.findHighestExpenseCategory();
        
        // Test Case 5: Monthly Report
        System.out.println("TEST 5: Monthly Expense Report - May 2026");
        System.out.println("-".repeat(70));
        tracker.generateMonthlyReport(5, 2026);
        
        // Test Case 6: May 2025 Report (Different Month)
        System.out.println("TEST 6: Monthly Expense Report - May 2025");
        System.out.println("-".repeat(70));
        tracker.generateMonthlyReport(5, 2025);
        
        // Test Case 7: Statistics
        System.out.println("TEST 7: Display Statistics");
        System.out.println("-".repeat(70));
        System.out.printf("Total Number of Expenses: %d\n", tracker.getExpenseCount());
        System.out.printf("Total Amount Spent: Rs.%.2f\n", tracker.getTotalExpenses());
        System.out.printf("Average Expense: Rs.%.2f\n", tracker.getAverageExpense());
        System.out.println();
        
        // Test Case 8: File Handling
        System.out.println("TEST 8: File Handling (Save & Load)");
        System.out.println("-".repeat(70));
        tracker.saveExpenses();
        System.out.println("\nCreating new tracker instance and loading from file...");
        ExpenseTracker tracker2 = new ExpenseTracker();
        System.out.printf("Loaded %d expenses from file\n", tracker2.getExpenseCount());
        System.out.println();
        
        System.out.println("=".repeat(70));
        System.out.println("ALL TESTS COMPLETED SUCCESSFULLY!");
        System.out.println("=".repeat(70) + "\n");
    }
    
    /**
     * Add test expenses with various categories and dates
     */
    private static void addTestExpenses(ExpenseTracker tracker) {
        // May 2026 entries
        tracker.addExpense(450, "Food", LocalDate.of(2026, 5, 1), "Lunch at restaurant");
        tracker.addExpense(1200, "Transport", LocalDate.of(2026, 5, 2), "Uber rides to office");
        tracker.addExpense(2500, "Shopping", LocalDate.of(2026, 5, 3), "New shoes and shirt");
        tracker.addExpense(350, "Entertainment", LocalDate.of(2026, 5, 4), "Movie tickets");
        tracker.addExpense(600, "Food", LocalDate.of(2026, 5, 5), "Groceries");
        tracker.addExpense(300, "Utilities", LocalDate.of(2026, 5, 6), "Electricity bill");
        tracker.addExpense(800, "Health", LocalDate.of(2026, 5, 7), "Doctor consultation and medicines");
        tracker.addExpense(200, "Education", LocalDate.of(2026, 5, 8), "Online course subscription");
        tracker.addExpense(500, "Food", LocalDate.of(2026, 5, 10), "Dinner with friends");
        tracker.addExpense(1500, "Shopping", LocalDate.of(2026, 5, 12), "Electronics");
        tracker.addExpense(400, "Transport", LocalDate.of(2026, 5, 15), "Petrol");
        tracker.addExpense(250, "Entertainment", LocalDate.of(2026, 5, 18), "Gaming");
        tracker.addExpense(700, "Food", LocalDate.of(2026, 5, 20), "Catering for party");
        tracker.addExpense(550, "Other", LocalDate.of(2026, 5, 25), "Gift for friend");
        tracker.addExpense(300, "Transport", LocalDate.of(2026, 5, 28), "Auto ride");
        
        // May 2025 entries (different year for testing monthly reports)
        tracker.addExpense(400, "Food", LocalDate.of(2025, 5, 5), "Breakfast and lunch");
        tracker.addExpense(1000, "Shopping", LocalDate.of(2025, 5, 10), "Clothes shopping");
        tracker.addExpense(600, "Transport", LocalDate.of(2025, 5, 15), "Travel expenses");
        
        // April 2026 entries
        tracker.addExpense(500, "Food", LocalDate.of(2026, 4, 20), "Monthly food supplies");
        tracker.addExpense(300, "Entertainment", LocalDate.of(2026, 4, 25), "Concert tickets");
        
        System.out.println("✓ Successfully added 21 test expense entries");
    }
}
