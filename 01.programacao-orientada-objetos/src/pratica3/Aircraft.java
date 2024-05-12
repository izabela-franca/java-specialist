package pratica3;

public class Aircraft {

    boolean active = true;
    int totalSeats;
    int bookedSeats;

    int calculateAvailableSeats() {
        return totalSeats - bookedSeats;
    }

    void bookSeats(int numberOfSeats) {
        if (active) {
            bookedSeats +=numberOfSeats;
        } else {
            System.out.printf("The aircraft is inactive. The seats were not booked.\n");
        }
    }

    void deactivate() {
        active = false;
    }

    void activate() {
        active = true;
    }

}
