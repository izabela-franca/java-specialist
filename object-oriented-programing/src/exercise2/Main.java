package exercise2;

public class Main {

    public static void main(String[] args) {

        Employer employer = new Employer();
        employer.name = "John";
        employer.numberOfChildren = 2;

        WorkContract contract = new WorkContract();
        contract.employer = employer;
        contract.valuePerWorkedHour = 100;
        contract.valuePerExtraHour = 200;

        Payroll salary = new Payroll();

        PayStub payStub = salary.calculateSalary(10, 5,contract);
        payStub.print();
    }
}
