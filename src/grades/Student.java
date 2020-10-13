package grades;

import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {
        Student student1 = new Student("Thomas", 80);
        System.out.println(student1.name);
        System.out.println(student1.grades);
        student1.addGrade(70);
        System.out.println(student1.grades);
        System.out.println("Grade Average: " + student1.getGradeAverage());

    }


    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String studentName , int grade){
        this.name = studentName;
        addGrade(grade); //calls add grade function
    }


    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (double grade: grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
