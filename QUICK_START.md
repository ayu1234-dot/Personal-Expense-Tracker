# Quick Start Guide - Personal Expense Tracker

## 📋 What's Included

```
project2/
├── Expense.java              ← Individual expense model
├── ExpenseTracker.java       ← Core business logic  
├── ExpenseTrackerApp.java    ← Interactive UI
├── ExpenseTrackerTest.java   ← Automated tests
├── expenses_data.dat         ← Data storage file
├── README.md                 ← Full documentation
└── PROJECT_SUMMARY.md        ← This project's completion status
```

## 🚀 Quick Start (3 steps)

### 1. Compile
```powershell
cd "c:\Users\AYUSH PRATAP SINGH\OneDrive\Desktop\project2"
javac Expense.java ExpenseTracker.java ExpenseTrackerApp.java ExpenseTrackerTest.java
```

### 2. Run Tests (to verify everything works)
```powershell
java ExpenseTrackerTest
```

### 3. Run Interactive App
```powershell
java ExpenseTrackerApp
```

## 🎮 Interactive Menu Options

```
1. Add New Expense     → Record daily expenses
2. View All Expenses   → See complete expense history
3. Monthly Report      → Analyze spending by month
4. Category Analysis   → See breakdown by category
5. Highest Category    → Find your top spending area
6. Statistics          → View total, average, count
7. Delete Expense      → Remove incorrect entries
0. Exit & Save         → Exit and save all data
```

## 📊 Features Demonstrated

✅ **a) Accept & Store Expenses**
- Add amount, category, date, description
- Automatic file saving

✅ **b) Display All Expenses**
- Formatted table view with entries

✅ **c) Monthly Reports**
- Generate by month/year
- Shows category breakdown & percentages

✅ **d) Highest Category**
- Identifies top spending category
- Shows total and entry count

✅ **e) File Handling**
- Save/Load using serialization
- Data persists between sessions

✅ **f) Testing**
- 21 test entries included
- All features automatically tested
- All tests passing ✓

## 📱 Example Workflow

```
1. Start: java ExpenseTrackerApp
2. Menu: Select 1
3. Enter: Amount=500, Category=Food, Date=01-05-2026
4. Confirm: "✓ Expense added successfully!"
5. Menu: Select 2
6. See: All expenses in nice table format
7. Menu: Select 4
8. See: Category breakdown with percentages
9. Menu: Select 0
10. Saves and exits
```

## 💾 Data Storage

- **File**: `expenses_data.dat` (binary format)
- **Format**: Java serialization
- **Auto-save**: After each operation
- **Auto-load**: On application startup

## 📈 Sample Test Results

```
Total Expenses: 20 entries
Total Amount: Rs.13,400
Average: Rs.670

Top 3 Categories:
1. Shopping: Rs.5,000 (37.3%)
2. Food: Rs.3,150 (23.5%)
3. Transport: Rs.2,500 (18.7%)
```

## ⚙️ Requirements Met

| Req | Feature | Status |
|-----|---------|--------|
| a | Accept expenses | ✅ |
| b | Display expenses | ✅ |
| c | Monthly reports | ✅ |
| d | Highest category | ✅ |
| e | File handling | ✅ |
| f | Testing | ✅ |

## 🔧 Technical Stack

- **Language**: Java (JDK 8+)
- **Collections**: ArrayList, HashMap
- **Date API**: java.time.LocalDate
- **File I/O**: Serialization
- **UI**: Console menu-driven

## 📝 Date Format

Always use: **DD-MM-YYYY**
Example: `01-05-2026` for May 1st, 2026

## 🎯 Categories Available

1. Food
2. Transport
3. Entertainment
4. Shopping
5. Utilities
6. Health
7. Education
8. Other

## ✨ Next Steps (Optional Enhancements)

- Add CSV export
- Generate PDF reports
- Budget alerts
- Chart visualization
- Multi-user support
- Cloud backup

---

**All requirements completed and tested! ✅**
