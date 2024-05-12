package pratica4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Using ArrayList from Collections API
        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Anne");
        students.add("Tom");
        students.remove(1);

        for (int i = 0; i < students.size(); i++) {
            String student = students.get(i);
            System.out.println(student);
            
        }
        
    }
}
