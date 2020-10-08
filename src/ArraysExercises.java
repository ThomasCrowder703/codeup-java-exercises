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

        for (Person individual : persons) {
            System.out.println("individual = " + individual.getName()); //I had to use .getName because each person is an object not a string

        }
//        System.out.println(Arrays.toString(addPerson(persons, new Person("Rex"))));

        addPerson(persons, new Person("Rex"));

    }

    public static Person[] addPerson(Person[] arg, Person newName) {
        Person[] copyOfPerson = Arrays.copyOf(arg, arg.length + 1);
        copyOfPerson[copyOfPerson.length - 1] = newName;
        for (int i = 0; i < copyOfPerson.length; i++) {
            System.out.println(copyOfPerson[i].getName());
        }


        return copyOfPerson;
    }
}

//walkthrough solution
//    public class ArraysExercises{
//        public static void main(String[] args) {
//
////            Person onePerson = new Person("Fer");
////            Person secondPerson = new Person("Ana"); refactored to write less code below
////            Person thirdPerson = new Person("Betty");
//
//            Person[] people = new Person[3];
//            people[0] = new Person("Fer");
//            people[1] = new Person("Ana");
//            people[2] = new Person("Betty"); //assigned values to the array
//
//            for (Person aPerson : people) {
//                System.out.println(aPerson.getName()); //looped through the array and printed names
//            }
//
//            Person[] newArray = addPerson(people, new Person("Robert"));
//
//            for (Person aPerson: newArray) {
//                System.out.println(aPerson.getName());
//            }
//
//        }
//
//        public static Person[] addPerson(Person[] tempArray, Person personToAdd){
//            tempArray = Arrays.copyOf(tempArray, tempArray.length +1);
//            tempArray(tempArray.length -1) = personToAdd;
//            return tempArray;
//        }
//    }




