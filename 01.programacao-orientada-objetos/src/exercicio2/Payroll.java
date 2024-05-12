package exercicio2;

public class Payroll {

    PayStub calculateSalary(int hoursWorked, int extraHours, WorkContract workContract) {

        PayStub payStub = new PayStub();
        payStub.employer = workContract.employer;
        payStub.totalWorkedHours = hoursWorked * workContract.valuePerWorkedHour;
        payStub.totalExtraHours = extraHours * workContract.valuePerExtraHour;

        double salary = payStub.totalExtraHours + payStub.totalExtraHours;

        if (workContract.hasChildrenAdditional()) {
            payStub.childrenAddtional = salary * 0.10;
        }

        return payStub;
    }

}
