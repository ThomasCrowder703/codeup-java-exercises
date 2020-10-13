package collections;

import grades.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();


        Student[] studentList = new Student[4];
        studentList[0] = new Student("Thomas", 80);
        studentList[1] = new Student("Halford", 90);
        studentList[2] = new Student("Jani", 100);
        studentList[3] = new Student("Phil", 75);

        for (Student student : studentList) {
            student.addGrade(90);
            student.addGrade(70);
            student.addGrade(60);
        }

        students.putIfAbsent("ThomasCrowder703", studentList[0]);
        students.putIfAbsent("JudasHalford1969", studentList[1]);
        students.putIfAbsent("JaniWarrant80", studentList[2]);
        students.putIfAbsent("Philtera87", studentList[3]);

        //command line interface below

        for (int counter = 0; counter >= 0; counter++) {
            System.out.println("Which Student would you like more information about? (Please type username)");
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
                System.out.println("Sorry we could not find any Student with that username(Please check for typos)");
            }

            System.out.println("Would you like to look at another student?(Yes or No)");
            String userConfirm = scan.nextLine();
            if (!userConfirm.equalsIgnoreCase("yes")) {
                break;
            }
//        System.out.println("Which Student would you like more information about? (Please type username)");
//        System.out.println(students.keySet());
//
//        Scanner scan = new Scanner(System.in);
//        String userInput = scan.nextLine();
//
//        if(userInput.equalsIgnoreCase("JaniWarrant80")){
//            System.out.println("Student Name: "+ studentList[2].getName());
//            System.out.println(studentList[2].getGradeAverage());
//        }else if(userInput.equalsIgnoreCase("ThomasCrowder703")){
//            System.out.println("Student Name: "+ studentList[0].getName());
//            System.out.println(studentList[0].getGradeAverage());
//        }else if(userInput.equalsIgnoreCase("JudasHalford1969")){
//            System.out.println("Student Name: "+ studentList[1].getName());
//            System.out.println(studentList[1].getGradeAverage());
//        }else if (userInput.equalsIgnoreCase("Philtera87")){
//            System.out.println("Student Name: "+ studentList[3].getName());
//            System.out.println(studentList[3].getGradeAverage());
//        }else{
//            System.out.println("Sorry we could not find any Student with that username(Please check for typos)");
//        }
//
//        System.out.println("Would you like to look at another student?");
//        String userConfirm = scan.nextLine();


        }


    }
}
