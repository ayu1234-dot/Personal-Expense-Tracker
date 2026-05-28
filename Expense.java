import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Expense implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private double amount;
    private String category;
    private LocalDate date;
    private String description;
    
    // Constructor
    public Expense(double amount, String category, LocalDate date, String description) {
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }
    
    // Constructor without description
    public Expense(double amount, String category, LocalDate date) {
        this(amount, category, date, "");
    }
    
    // Getters
    public double getAmount() {
        return amount;
    }
    
    public String getCategory() {
        return category;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public String getDescription() {
        return description;
    }
    
    // Setters
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return String.format("Date: %s | Category: %-12s | Amount: Rs.%.2f | Description: %s",
                date.format(formatter), category, amount, description);
    }
}
