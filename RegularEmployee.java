public class RegularEmployee extends Employee implements salaryComputation {
    protected double netSalary;
    protected double grossSalary;
    protected double deduction;

    public double computeDeduction() {
        deduction = (getDailyRate() * 20) * .20;
        return deduction;
    }

    @Override
    public double computeNetSalary() {
        // with deduction
        netSalary = computeGrossSalary() - computeDeduction();
        return netSalary;
    }

    @Override
    public double computeGrossSalary() {
        grossSalary = (super.numberOfDays * super.getDailyRate()) + (super.overtimeHrs * (super.dailyRate * 0.15));
        return grossSalary;
    }

    @Override
    public void display() {
        System.out.println("================================" + "\n" + "Regular Employee Details" + "\n"
                + "================================" + "\n");
        System.out.println("Employee name: " + getFullName());
        System.out.println("Gross Salary: " + computeGrossSalary());
        System.out.println("Total Deduction: " + computeDeduction());
        System.out.println("Net Salary: " + computeNetSalary());
    }

}
