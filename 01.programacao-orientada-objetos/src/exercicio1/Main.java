package exercicio1;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Snow";
        dog1.breed = "Poodle";
        dog1.gender = "Male";
        dog1.age = 3;


        Dog dog2 = new Dog();
        dog2.name = "Pearl";
        dog2.breed = "Border Colie";
        dog2.gender = "Female";
        dog2.age = 1;

        System.out.printf("Name: %s\nBreed: %s\nGender: %s\nAge: %d\n", dog1.name,dog1.breed, dog1.gender, dog1.age);
        System.out.println("-----------------------");
        System.out.printf("Name: %s\nBreed: %s\nGender: %s\nAge: %d", dog2.name,dog2.breed, dog2.gender, dog2.age);

    }
}
