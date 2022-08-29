
public class ContractualEmployee extends Employee implements salaryComputation {
    private final int DEDUCTION = 1250;

    private double netSalary;
    private double grossSalary;

    @Override
    public double computeNetSalary() {
        netSalary = grossSalary - DEDUCTION;
        return netSalary;
    }

    @Override
    public double computeGrossSalary() {
        grossSalary = numberOfDays * getDailyRate();
        return grossSalary;
    }

    @Override
    public void display() {
        System.out.println("================================" + "\n" + "Contractual Employee Details" + "\n"
                + "================================" + "\n");

        System.out.println("Employee name: " + getFullName());
        System.out.println("Gross Salary: " + computeGrossSalary());
        System.out.println("Total Deduction: " + DEDUCTION);
        System.out.println("Net Salary: " + computeNetSalary());

    }

}
