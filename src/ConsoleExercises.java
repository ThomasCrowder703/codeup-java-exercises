import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f\n", pi);
//
        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter an Integer.");
//
//        int userInt = sc.nextInt();
//        System.out.printf("Your number is %d", userInt);

        System.out.println("Please enter three words");
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();
        System.out.printf("Your words are: \n %s \n %s \n %s", firstWord, secondWord, thirdWord);
    }
}
