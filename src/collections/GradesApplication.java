package collections;

import grades.Student;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();


        Student awesomeStudent = new Student("Awesome");
        awesomeStudent.addGrade(100);
        awesomeStudent.addGrade(100);
        awesomeStudent.addGrade(99);

        Student[] studentList = new Student[4];
        studentList[0] = new Student("Thomas");
        studentList[1] = new Student("Halford");
        studentList[2] = new Student("Jani");
        studentList[3] = new Student("Phil");

        for (Student student : studentList) {
            student.addGrade(90);
            student.addGrade(70);
            student.addGrade(60);
            student.addGrade(100);
        }

        students.putIfAbsent("AwesomeCoder99", awesomeStudent); // adding individual student
        students.putIfAbsent("ThomasCrowder703", studentList[0]); // adding from array
        students.putIfAbsent("JudasHalford1969", studentList[1]);
        students.putIfAbsent("JaniWarrant80", studentList[2]);
        students.putIfAbsent("Philtera87", studentList[3]);

        //command line interface below

        for (int counter = 0; counter >= 0; counter++) { //Infinite loop intentional/ break statement below
            System.out.println("Which Student would you like to see more information on? (Please type username)");
            System.out.println(students.keySet());

            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();

            if (userInput.equalsIgnoreCase("JaniWarrant80")) {
                System.out.println("Student Name: " + studentList[2].getName());
                System.out.println("Grade Average: " + studentList[2].getGradeAverage());
            } else if (userInput.equalsIgnoreCase("ThomasCrowder703")) {
                System.out.println("Student Name: " + studentList[0].getName());
                System.out.println("Grade Average: " + studentList[0].getGradeAverage());
            } else if (userInput.equalsIgnoreCase("JudasHalford1969")) {
                System.out.println("Student Name: " + studentList[1].getName());
                System.out.println("Grade Average" + studentList[1].getGradeAverage());
            } else if (userInput.equalsIgnoreCase("Philtera87")) {
                System.out.println("Student Name: " + studentList[3].getName());
                System.out.println("Grade Average: " + studentList[3].getGradeAverage());
            } else {
                System.err.println("Sorry we could not find any Student with that username(Please check for typos)");
            }

            System.out.println("Would you like to look at another student?(Yes or No)");
            String userConfirm = scan.nextLine();
            if (!userConfirm.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
