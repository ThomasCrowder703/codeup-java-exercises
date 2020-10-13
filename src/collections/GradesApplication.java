package collections;

import grades.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();


        Student[] studentList = new Student[4];
        studentList[0] = new Student("Thomas", 80);
        studentList[1] = new Student("Halford", 90);
        studentList[2] = new Student("Jani", 100);
        studentList[3] = new Student("Phil", 75);

        for (Student student: studentList) {
            student.addGrade(90);
            student.addGrade(70);
            student.addGrade(60);
        }

        students.putIfAbsent("ThomasCrowder703",studentList[0]);
        students.putIfAbsent("JudasHalford1969",studentList[1]);
        students.putIfAbsent("JaniWarrant80",studentList[2]);
        students.putIfAbsent("Philtera87",studentList[3]);






    }


}

