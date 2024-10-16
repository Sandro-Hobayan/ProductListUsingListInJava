package studentList;

import java.util.List;
import java.util.ArrayList;

public class MainForStudents {
    public static void main(String []args){

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Sandro", "BSIT", "BSIT3B"));
        studentList.add(new Student(2, "Mika", "BSIT", "BSIT3B"));
        studentList.add(new Student(3, "Simon", "BSIT", "BSIT3A"));
        studentList.add(new Student(4, "Zachary", "BSIT", "BSIT3V"));

        for(int i = 0; i < studentList.size(); i++){
            studentList.get(i).listOfStudent();
        }

    }
}
