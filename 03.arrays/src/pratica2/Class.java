package pratica2;

import java.util.Arrays;

public class Class {

    String identification;
    String teacherName;
    Student[] students = new Student[0];

    //Copying and expanding an array
    void addStudent(Student student){
        this.students = Arrays.copyOf(this.students, this.students.length + 1);
        students[students.length - 1] = student;
    }

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
