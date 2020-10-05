import java.util.Random;
import java.util.Scanner;


public class HighLow {
    public static void main(String[] args){
//        //walkthrough solution
        Scanner scan = new Scanner(System.in);
        int range = 100 -1 + 1;
        int numberToGuess = (int) ((Math.random() + range) + 1);
        System.out.println("numberToGuess = " + numberToGuess);

        while (true){
            System.out.println("Guess a number between 1 and 100");
            short userInput = Short.parseShort(scan.nextLine());
            if (userInput > numberToGuess){
                System.out.println("HIGHER");
            } else if (userInput < numberToGuess){
                System.out.println("LOWER");
            } else{
                System.out.println("GOOD GUESS!");
                break;
            }
        }

    }

//    public static int userInput() {
//        System.out.println("Enter a number from 1 - 100");
//        Scanner scan = new Scanner(System.in);
//        int userGuess = scan.nextInt();
//        return userGuess;
//    }
//
//    public static void randomNumber(int param) {
//       Random random = new Random();
//       int maximumRange = 101;
//       int int_random = random.nextInt(maximumRange);
//        System.out.println(int_random);
//
//        for(int i =1; i >= 1; i++){
//            if (param == int_random){
//                System.out.println("Good Guess");
//                break;
//            }else if(param < int_random){
//                System.out.println("Guess HIGHER");
//            }else if(param > int_random){
//                System.out.println("Guess LOWER");
//            }
//        }
//
//        }





    }






