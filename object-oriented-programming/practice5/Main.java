package practice5;

public class Main {

    public static void main(String[] args) {

        Visitor newVisitor = new Visitor();
        newVisitor.name = " John";
        newVisitor.age = 12;

        if (newVisitor.age < Visitor.MINIMUN_AGE) {
            System.out.printf("Access not allowed to visitors under %d.", Visitor.MINIMUN_AGE);
        } else {
            System.out.println("Access granted.");
        }

    }
}
