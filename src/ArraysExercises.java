import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    public static void main(String[] args) {
        //Q: What happens when you run the following code? Why is Arrays.toString necessary? A:You will get the ID address not the values
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] persons = new Person[3];



        persons[0] = new Person("Phil");
        persons[1] = new Person("Darrel");
        persons[2] = new Person("Vinnie");

        for (Person individual:persons) {
            System.out.println("individual = " + individual.getName()); //I had to use .getName because each person is an object not a string

        }
        addPerson(persons, "Rex");
//        addPerson(persons, "Terry"); //Ask about adding more than one person
    }

    public static Person[] addPerson(Person[] arg, String newName){
        Person[] copyOfPerson = Arrays.copyOf(arg, arg.length + 1);
        copyOfPerson [3] = new Person(newName);
        for(int i =0; i< copyOfPerson.length; i++){
            System.out.println(copyOfPerson[i].getName());
        }

        return copyOfPerson;
    }
}
