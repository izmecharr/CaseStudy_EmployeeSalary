import java.util.Scanner;

public class Employee {

    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected int numberOfDays;
    protected int overtimeHrs;
    protected double dailyRate;
    protected Scanner scanner = new Scanner(System.in);

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.middleName = "";
        this.numberOfDays = 0;
        this.overtimeHrs = 0;
        this.dailyRate = 0;
    }

    public void startUi() {
        System.out.println("================================");
        setFirstName();
        setMiddleName();
        setLastName();

        System.out.println("");
        setNumberOfDays();
        setOvertimeHrs();
        setDailyRate();

        System.out.println("");
        System.out.println("Employee Name: " + getFullName());
        System.out.println("Number of Days Worked: " + getNumberofDays());
        System.out.println("Overtime Hours: " + getOvertimeHrs());
        System.out.println("Daily Rate: " + getDailyRate());
        System.out.println("================================");
        System.out.println("");

    }

    public String getFullName() {
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName() {
        System.out.print("Enter First Name: ");
        this.firstName = scanner.nextLine();
    }

    public void setMiddleName() {
        System.out.print("Enter Middle Name: ");
        this.middleName = scanner.nextLine();

    }

    public void setLastName() {
        System.out.print("Enter Last Name: ");
        this.lastName = scanner.nextLine();

    }

    public void setNumberOfDays() {
        System.out.print("Enter number of days worked: ");
        this.numberOfDays = Integer.valueOf(scanner.nextLine());
    }

    public int getNumberofDays() {
        return this.numberOfDays;
    }

    public void setOvertimeHrs() {
        System.out.print("Enter overtime hours worked: ");
        this.overtimeHrs = Integer.valueOf(scanner.nextLine());
    }

    public int getOvertimeHrs() {
        return this.overtimeHrs;
    }

    public double getDailyRate() {
        return this.dailyRate;
    }

    public void setDailyRate() {
        System.out.print("Enter daily rate: ");
        this.dailyRate = Double.valueOf(scanner.nextLine());
    }

}