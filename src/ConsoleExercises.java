import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f\n", pi);

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an Integer.");

        int userInt = sc.nextInt();
        System.out.printf("Your number is %d", userInt);
    }
}
