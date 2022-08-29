import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("================================" + "\n" + "Employee Input Details" + "\n"
                + "================================" + "\n");
        Employee employee = new Employee();
        employee.startUi();
        pressEnterKeyToContinue();
        cls();

        System.out.println("================================" + "\n" + "Regular Employee Salary Details" + "\n"
                + "================================" + "\n");
        RegularEmployee regularEmployee = new RegularEmployee();
        regularEmployee.startUi();
        regularEmployee.display();
        pressEnterKeyToContinue();
        cls();

        System.out.println("================================" + "\n" + "Contractual Employee Salary Details" + "\n"
                + "================================" + "\n");
        ContractualEmployee contractualEmployee = new ContractualEmployee();
        contractualEmployee.startUi();
        contractualEmployee.display();
        pressEnterKeyToContinue();
        cls();
        exitProgram();

    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public static void pressEnterKeyToContinue() {
        System.out.println("");
        System.out.println("Press Enter key to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

    public static void exitProgram() {
        System.out.println("Exiting program...");
        System.exit(0);
    }
}
