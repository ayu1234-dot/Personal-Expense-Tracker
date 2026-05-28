# Personal Expense Tracker - Java Application

## Project Overview
A comprehensive personal expense tracking application developed in Java that allows users to manage daily expenses, analyze spending patterns, and generate detailed reports.

## Key Features

### 1. **Accept and Store Expense Details** ✓
- Record daily expenses with amount, category, and date
- Add optional descriptions for each expense
- Real-time data persistence to file system

### 2. **Display All Recorded Expenses** ✓
- View complete list of all expenses
- Formatted display with date, category, amount, and description
- Numbered entries for easy reference

### 3. **Generate Monthly Expense Reports** ✓
- Filter expenses by month and year
- Display monthly totals and category-wise breakdown
- Show percentage distribution of spending across categories

### 4. **Identify Highest Expense Category** ✓
- Automatically identifies the category with maximum spending
- Displays total amount and number of entries
- Helps understand spending priorities

### 5. **File Handling (Save & Load)** ✓
- Save expenses to persistent storage (serialization)
- Automatic loading of saved data on startup
- File-based data backup: `expenses_data.dat`

### 6. **Additional Features** ✓
- Category analysis with percentage distribution
- View expense statistics (total, average, count)
- Delete individual expenses
- Interactive menu-driven interface
- Comprehensive automated testing

## Project Structure

```
project2/
├── Expense.java              # Model class for individual expenses
├── ExpenseTracker.java       # Core tracker with business logic
├── ExpenseTrackerApp.java    # Interactive menu-driven application
├── ExpenseTrackerTest.java   # Automated test suite with sample data
├── expenses_data.dat         # Data file (created on first run)
└── README.md                 # This file
```

## Supported Categories
- Food
- Transport
- Entertainment
- Shopping
- Utilities
- Health
- Education
- Other

## Class Descriptions

### Expense.java
Represents a single expense with:
- `amount` (double): Expense amount
- `category` (String): Category name
- `date` (LocalDate): Date of expense
- `description` (String): Optional description
- Implements `Serializable` for file storage

### ExpenseTracker.java
Core business logic including:
- `addExpense()`: Add new expense
- `displayAllExpenses()`: Show all recorded expenses
- `generateMonthlyReport()`: Create monthly reports
- `findHighestExpenseCategory()`: Identify top spending category
- `displayCategoryAnalysis()`: Show category-wise totals
- `getTotalExpenses()`: Calculate total spending
- `getAverageExpense()`: Calculate average expense
- `saveExpenses()`: Persist data to file
- `loadExpenses()`: Retrieve data from file

### ExpenseTrackerApp.java
User interface with:
- Interactive menu system
- Input validation
- Error handling
- Category selection
- Date input (DD-MM-YYYY format)
- Real-time file saving

### ExpenseTrackerTest.java
Automated testing with:
- 21 sample expense entries
- Multiple months and years
- All feature demonstrations
- Category distribution testing
- File I/O testing

## How to Compile and Run

### Prerequisites
- Java JDK 8 or higher
- Terminal or Command Prompt

### Compilation
Navigate to the project directory and compile all Java files:

```bash
# On Windows
javac Expense.java ExpenseTracker.java ExpenseTrackerApp.java ExpenseTrackerTest.java

# Or compile individually
javac Expense.java
javac ExpenseTracker.java
javac ExpenseTrackerApp.java
javac ExpenseTrackerTest.java
```

### Run the Interactive Application
```bash
java ExpenseTrackerApp
```

### Run the Automated Tests
```bash
java ExpenseTrackerTest
```

## Usage Guide

### Adding an Expense
1. Select option **1** from the main menu
2. Enter the expense amount
3. Choose a category (1-8)
4. Enter date in format `DD-MM-YYYY`
5. Optionally add a description
6. Expense is automatically saved

### Viewing Expenses
- Select option **2** to see all recorded expenses
- Expenses are displayed in formatted table

### Monthly Reports
- Select option **3**
- Enter month (1-12) and year
- View detailed breakdown with categories and percentages

### Category Analysis
- Select option **4**
- See all categories sorted by total spending
- View percentage distribution

### Finding Top Category
- Select option **5**
- Instantly identifies your highest spending category

### View Statistics
- Select option **6**
- See total expenses, count, and average

### Delete Expenses
- Select option **7**
- View list and enter number to delete

### Exit
- Select option **0**
- All data is automatically saved

## Data Storage

### File Format
Expenses are stored as serialized Java objects in `expenses_data.dat`. This ensures:
- Data integrity
- Type safety
- Easy loading in Java
- Binary format (compact storage)

### Data Persistence
- Automatic save after each operation
- Automatic load on application startup
- Backup through file versioning (manual)

## Sample Test Output

The test suite demonstrates:
- ✓ 21 expense entries across multiple months
- ✓ Various categories with realistic amounts
- ✓ Monthly report generation
- ✓ Category analysis (highest to lowest)
- ✓ File save and load functionality

### Test Categories Distribution
- **Food**: High-frequency, moderate amounts (45% average)
- **Shopping**: Fewer but larger transactions
- **Transport**: Regular daily expenses
- **Entertainment**: Discretionary spending
- **Utilities**: Fixed recurring expenses
- **Health & Education**: Variable/annual expenses

## Technologies Used
- **Language**: Java 8+
- **Collections**: ArrayList, HashMap
- **Date/Time**: java.time.LocalDate, java.time.YearMonth
- **File I/O**: ObjectInputStream, ObjectOutputStream (Serialization)
- **Formatting**: DateTimeFormatter

## Key Algorithms

### Finding Highest Category
```
Iterate through all expenses
Aggregate by category in HashMap
Find maximum value
Return corresponding category
```

### Monthly Report Generation
```
Filter expenses by YearMonth
Calculate category-wise totals
Compute percentages
Display formatted report
```

### Average Calculation
```
Sum all amounts
Divide by count
Handle empty list edge case
```

## Error Handling
- Invalid amounts (must be positive)
- Invalid category selection
- Date parsing errors (must follow DD-MM-YYYY)
- File I/O exceptions
- Empty expense list conditions
- Integer input validation

## Future Enhancements
- Database integration (SQLite, MySQL)
- Export to CSV/PDF reports
- Budget setting and notifications
- Visual charts and graphs
- Multi-user support
- Recurring expenses
- Receipt image storage
- Cloud backup

## Learning Outcomes
Through this project, students learn:
- **Collections Framework**: ArrayList and HashMap usage
- **File I/O**: Serialization and persistence
- **Date/Time API**: LocalDate and date operations
- **Object-Oriented Design**: Classes, inheritance, encapsulation
- **User Interface Design**: Menu-driven applications
- **Exception Handling**: Try-catch and input validation
- **Data Analysis**: Aggregation and reporting

## License
Educational Project - Free to use and modify

## Author Notes
This project is designed as a practical learning exercise emphasizing real-world Java development patterns including data management, file handling, and user interaction.
