package practice2;

public class Class {

    String identification;
    String teacherName;
    Student[] students;

    void printListofStudents() {
        for (Student student : students) {
            if (student != null) {
                System.out.printf("%s (%d years old)\n", student.name, student.age);
            } else {
                System.out.println("empty");
            }
        }
    }

}
