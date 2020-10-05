import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class MethodsExercise {
    public static void main(String[] args){
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(1, 2));
//        System.out.println(multiply(1, 2));
//        System.out.println(divide(4, 2));
//        System.out.println(modulus(4,2));
//
//        getInteger(1,10);

//        factorial();
//        diceRoll(); //return to this problem

    }

        public static int addition(int firstParam, int secondParam){
            return firstParam + secondParam;
        }

        public static int subtraction(int firstParam, int secondParam){
            return firstParam - secondParam;
        }

        public static int multiply(int firstParam, int secondParam){
            return firstParam * secondParam;
        }

        public static int divide(int firstParam, int secondParam){
            return firstParam / secondParam;
        }

        public static int modulus(int firstParam, int secondParam){
            return firstParam % secondParam;
        }

        public static String getInteger(int min, int max){
            System.out.println("Please enter a number between 1 - 10");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            if(userInput >= min && userInput <= max){
                return "You are in range";
            }else{
                 return getInteger(min, max);
            }
        }

        public static long factorial(){
            System.out.println("Please enter a number between 1 - 10");
            Scanner scan = new Scanner(System.in);
            long userInput = scan.nextInt();
            long accumulate = 1;
            for(long i=1; i<= userInput; i++){
              accumulate *= i;
            }
            System.out.println(accumulate);
            return accumulate;
        }

//        public static String diceRoll(){
//            System.out.println("Please enter how many sides are on your dice");
//            Scanner scan = new Scanner(System.in);
//            int userInput = scan.nextInt();
//            Random random = new Random();
//            int upperbound = userInput + 1;
//            int randomNumber = random.nextInt(upperbound);
//            System.out.println(randomNumber);
//
//            System.out.println("Please roll the dice. [y/N]");
//            String userRoll = scan.nextLine();
//            if(userRoll.equals("y")){
//                Random random2 = new Random();
//                int upperbound2 = userInput + 1;
//                int randomNumber2 = random.nextInt(upperbound);
//                System.out.println(randomNumber2);
//
//                String diceNumbers = (randomNumber +" & " +randomNumber2);
//                System.out.println(diceNumbers);
//
//            }
//
//           return diceNumbers;  //Return to this problem
//        }

}

