package practice5;

public class Main {

    public static void main(String[] args) {

        Visitor newVisitor = new Visitor();
        newVisitor.name = " John";
        newVisitor.age = 12;

        if (newVisitor.age < Visitor.MINIMUN_AGE) {
            System.out.printf("Access is not allowed for visitors under %d.\n", Visitor.MINIMUN_AGE);
        } else {
            System.out.println("Access granted.");
        }

        //Local variable type inference (var)
        var registration = new Registration();
        registration.register(newVisitor, 2);

    }
}

