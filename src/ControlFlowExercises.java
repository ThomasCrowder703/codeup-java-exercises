import java.util.Scanner;
import java.util.Formatter;

public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i++);
//        }
//        int i = 100;
//        System.out.print(i +"\n");
//        do {
//            System.out.println(i -= 5);
//        }while (i > -10);
//        int i = 2;
//        do{
//            System.out.println(i);
//            i = (int) Math.pow(i,2);
//        }while (i < 1000000);

//        for (int i = 5; i<=15;i++){
//            System.out.println(i);
//        }

//        for(int i=2; i < 1000000; i = (int) Math.pow(i,2)){
//            System.out.println(i);
//        }

//        for(int i=1; i<=100; i++){
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            if(i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("FIzzBuzz");
//            }
//            if (i % 3 != 0 && i % 5 != 0){
//                System.out.println(i);
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an integer.");
//        int userInteger = sc.nextInt();
//        System.out.println("Would you like to continue?[y/N]");
//        Scanner scan = new Scanner(System.in);
//        String userInput = scan.next();
//        boolean confirmation = userInput.equals("y");
//        if(confirmation){
//            System.out.println("Here is your table: ");
//            System.out.println(" ");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInteger; i++){
//                int squared = (int) Math.pow(i,2);
//                int cubed = (int) Math.pow(i,3);
//                if(i < 4){
//                    System.out.println(i + "      |" + squared + "        |" + cubed);
//                } else {
//                    System.out.println(i + "      |" + squared + "       |" + cubed);
//                }
//
//            }
//        }
// Walkthrough method below
//        Scanner scanner = new Scanner(System.in);
//
//        boolean userContinues = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("Here is your table.");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInt; i++){
//                System.out.printf("%-6d", i);
//                System.out.printf(" | ");
//                System.out.printf("%-7d", i * i); //%7d adds padding to the columns
//                System.out.printf(" | ");
//                System.out.print(i*i*i);
//                System.out.println();
//            }
//
//            System.out.println("Would you like to enter another number [y/N]?");
//            String userResponse = scanner.next();
//            if(!userResponse.equalsIgnoreCase("y")){
//                userContinues = false;
//            }
//
//        }while(userContinues);



//        System.out.println("Please enter your grade (1 - 100):");
//        Scanner scan = new Scanner(System.in);
//        int userGrade = scan.nextInt();
//        System.out.println("Would you like to continue?[y/N]");
//        String userInput = scan.next();
//        boolean confirmation = userInput.equals("y");
//        if (confirmation){
//            if(userGrade >= 88){
//                System.out.println("You earned an A!");
//            }else if(userGrade >= 80){
//                System.out.println("You made a B!");
//            }else if(userGrade >= 67){
//                System.out.println("You got a C. Study up!");
//            }else if(userGrade >= 60){
//                System.out.println("Your grade was a D. You're in danger!");
//            }else{
//                System.out.println("You failed!");
//            }
//        }
//


    }
}
