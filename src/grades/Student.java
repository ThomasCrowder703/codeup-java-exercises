package grades;

import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {
        Student student1 = new Student("Thomas");
        System.out.println(student1.name);
        System.out.println(student1.grades);
        student1.addGrade(70);
        System.out.println(student1.grades);
        System.out.println("Grade Average: " + student1.getGradeAverage());

    }


    private String name;
    private ArrayList<Integer> grades;

    public Student(String studentName){
        this.name = studentName;
        this.grades = new ArrayList<>();
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
        for (double grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
