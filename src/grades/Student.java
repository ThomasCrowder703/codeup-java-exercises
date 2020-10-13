package grades;

import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {

    }


    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String studentName, ArrayList<Integer> studentGrades){
        this.name = studentName;
        this.grades = studentGrades;
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
        return sum;
    }
}
