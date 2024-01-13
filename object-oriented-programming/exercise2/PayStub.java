package exercise2;

public class PayStub {

    Employer employer;
    double totalWorkedHours;
    double totalExtraHours;
    double childrenAddtional;

    double totalValue() {
        return  totalWorkedHours + totalExtraHours + childrenAddtional;
    }

    void print() {
        System.out.println("Pay Stub");
        System.out.println("Employer's name: " + employer.name);
        System.out.println("Total value for hours worked: " + totalWorkedHours);
        System.out.println("Total value for extrachours worked: " + totalExtraHours);
        System.out.println("Total value for children additional: "+  childrenAddtional);
    }

}
