import java.util.Random;
import java.util.Scanner;


public class HighLow {
    public static void main(String[] args){
        randomNumber();
    }

    public static void randomNumber() {
       Random random = new Random();
       int maximumRange = 101;
       int int_random = random.nextInt(maximumRange);
        System.out.println(int_random);

        System.out.println("Enter a number from 1 - 100");
        for(int i =1; i >= 1; i++){
            Scanner scan = new Scanner(System.in);
            int userGuess = scan.nextInt();
            if (userGuess == int_random){
                System.out.println("Good Guess");
                break;
            }else if(userGuess < int_random){
                System.out.println("Guess HIGHER");
            }else if(userGuess > int_random){
                System.out.println("Guess LOWER");
            }
        }

        }
    }



