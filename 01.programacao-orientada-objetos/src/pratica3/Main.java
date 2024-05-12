package pratica3;

public class Main {

    public static void main(String[] args) {

        Aircraft plane1 = new Aircraft();
        plane1.totalSeats = 100;
        plane1.activate();
        plane1.bookSeats(10);

        System.out.printf("Plane 1 (%s): %d available seats\n", plane1.active ? "Active" : "Inactive",
                plane1.calculateAvailableSeats());

    }

}
