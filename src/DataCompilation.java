
import java.util.Scanner;

class DataCompilation {

    String firstname, lastname, course_enrolled, designation, department_name;
    int age, salary, ID;

    // Setters and Getters for all fields
    void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    void setLastname(String lastname) {
        this.lastname = lastname;
    }

    void setCourseEnrolled(String course_enrolled) {
        this.course_enrolled = course_enrolled;
    }

    void setDesignation(String designation) {
        this.designation = designation;
    }

    void setDepartmentName(String department_name) {
        this.department_name = department_name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    void setID(int ID) {
        this.ID = ID;
    }

    String getFirstname() {
        return firstname;
    }

    String getLastname() {
        return lastname;
    }

    String getCourseEnrolled() {
        return course_enrolled;
    }

    String getDesignation() {
        return designation;
    }

    String getDepartmentName() {
        return department_name;
    }

    int getAge() {
        return age;
    }

    int getSalary() {
        return salary;
    }

    int getID() {
        return ID;
    }
}

class GetIts extends DataCompilation {

    // Constructor to collect data and display the entered details
    GetIts() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter type of details (student or employee): ");
        String detailType = scan.nextLine();

        if (detailType.equalsIgnoreCase("student")) {
            // Collect student details
            System.out.print("Enter First Name: ");
            setFirstname(scan.nextLine());

            System.out.print("Enter Last Name: ");
            setLastname(scan.nextLine());

            System.out.print("Enter Age: ");
            setAge(scan.nextInt());
            scan.nextLine(); // Consume the newline

            System.out.print("Enter Course Enrolled: ");
            setCourseEnrolled(scan.nextLine());

            System.out.print("Enter ID: ");
            setID(scan.nextInt());
        } else if (detailType.equalsIgnoreCase("employee")) {
            // Collect employee details
            System.out.print("Enter First Name: ");
            setFirstname(scan.nextLine());

            System.out.print("Enter Last Name: ");
            setLastname(scan.nextLine());

            System.out.print("Enter Age: ");
            setAge(scan.nextInt());
            scan.nextLine(); // Consume the newline

            System.out.print("Enter Designation: ");
            setDesignation(scan.nextLine());

            System.out.print("Enter Department Name: ");
            setDepartmentName(scan.nextLine());

            System.out.print("Enter Salary: ");
            setSalary(scan.nextInt());

            System.out.print("Enter Employee ID: ");
            setID(scan.nextInt());
        } else {
            System.out.println("Invalid input. Please enter either 'student' or 'employee'.");
            return;
        }

        // Display the collected details
        System.out.println("\nEntered Details: ");
        System.out.println("First Name: " + getFirstname());
        System.out.println("Last Name: " + getLastname());
        System.out.println("Age: " + getAge());
        if (detailType.equalsIgnoreCase("student")) {
            System.out.println("Course Enrolled: " + getCourseEnrolled());
            System.out.println("ID: " + getID());
        } else if (detailType.equalsIgnoreCase("employee")) {
            System.out.println("Designation: " + getDesignation());
            System.out.println("Department Name: " + getDepartmentName());
            System.out.println("Salary: " + getSalary());
            System.out.println("Employee ID: " + getID());
        }
    }

    public static void main(String[] args) {
        new GetIts();
    }
}