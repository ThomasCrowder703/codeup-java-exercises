import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f\n", pi);
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Please enter an Integer.");
//
//        int userInt = sc.nextInt();
//        System.out.printf("Your number is %d\n", userInt);
//
//        System.out.println("Please enter three words");
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//        System.out.printf("Your words are: \n %s \n %s \n %s\n", firstWord, secondWord, thirdWord);
//
//        Scanner sentence = new Scanner(System.in);
//        System.out.println("Please enter a sentence");
//        String userSentence =  sentence.nextLine();
//        System.out.printf("%s", userSentence);

        Scanner calculatePerimeter = new Scanner(System.in);
        System.out.println("Please enter the length of the codeup classroom");
        int length = Integer.parseInt(calculatePerimeter.nextLine());

        System.out.println("Please enter the width of the classroom");
         int width = Integer.parseInt(calculatePerimeter.nextLine());

         int area = length * width;
         int perimeter = (length * 2) + (width * 2);

        System.out.printf("The area is %d and the perimeter is %d", area, perimeter);
    }

}
