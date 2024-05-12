package exercicio2;

public class WorkContract {

    Employer employer;
    double valuePerWorkedHour;
    double valuePerExtraHour;

    boolean hasChildrenAdditional() {
        return employer.hasChildren();
    }

}
