public class PayrollMain {

    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee();
        f.setEmployeeId(101);
        f.setEmployeeName("Love");
        f.setMonthlySalary(50000);

        PartTimeEmployee p = new PartTimeEmployee();
        p.setEmployeeId(102);
        p.setEmployeeName("Rahul");
        p.setHoursWorked(80);
        p.setHourlyRate(300);

        System.out.println("Full Time Employee");
        f.displayEmployeeInfo();
        System.out.println("Salary : " + f.calculateSalary());

        System.out.println();

        System.out.println("Part Time Employee");
        p.displayEmployeeInfo();
        System.out.println("Salary : " + p.calculateSalary());
    }
}