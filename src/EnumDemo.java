public class EnumDemo {
    public static void main(String[] args) {
        // Accessing the enum values and printing their salaries
        for (Payment p : Payment.values()) {
            System.out.println(p + " salary: " + p.getSalary());
        }
    }
}

enum Payment {
    SECURITY(50000), STAFFS(100000);

    // Enum field to hold the salary value
    private final int salary;

    // Constructor for the enum, which assigns the salary value
    Payment(int salary) {
        this.salary = salary;
    }

    // Method to retrieve the salary
    public int getSalary() {
        return salary;
    }
}