package pratica5;

public class Registration {

    static final int EXPIRATION_TIME_IN_MONTHS = 1;

    //Overloading
    void register(Visitor visitor) {
        this.register(visitor, EXPIRATION_TIME_IN_MONTHS);

    }

    void register(Visitor visitor, int expirationTime) {
        final int expirationTimeInDays;
        expirationTimeInDays = expirationTime * 30;

        System.out.printf("Visitor %s is registered for %d days.\n", visitor.name, expirationTimeInDays);
    }

}

