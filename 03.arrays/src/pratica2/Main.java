package pratica2;

public class Main {

    public static void main(String[] args) {

        //Array of Objects
        Class classA = new Class();
        classA.identification = "Elementary 1";
        classA.teacherName = "Mary";
        //classA.students = new Student[3];

        //classA.students[0] = new Student();
        //classA.students[0].name = "John";
        //classA.students[0].age = 8;

        Student student1 = new Student();
        student1.name = "Anna";
        student1.age = 9;
        //classA.students[1] = student1;

        Student student2 = new Student();
        student2.name = "Peter";
        student2.age = 8;

        //Loooping through students
//        for (int i = 0; i < classA.students.length; i++) {
//            Student student = classA.students[i];
//            if(classA.students[i] != null) {
//                System.out.printf("%d - %s (%d years old)\n",
//                        i, student.name, student.age);
//            } else {
//                System.out.printf("%d - empty\n", i);
//            }
//        }

        classA.addStudent(student1);
        classA.addStudent(student2);

        classA.printListofStudents();
    }
}
