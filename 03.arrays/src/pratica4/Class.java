package pratica4;

import java.util.ArrayList;

public class Class {

    String identification;
    String teacherName;
    ArrayList<Student> students = new ArrayList<>();

    //Copying and expanding an array
    void addStudent(Student student) {
        students.add(student);
    }

    void removeStudent(int index) {
        students.remove(index);
    }

    void printListofStudents() {
        for (Student student : students) {
            System.out.printf("%s (%d years old)\n", student.name, student.age);
        }
    }

}
