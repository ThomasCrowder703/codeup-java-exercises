package util;
import java.util.Scanner;


public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string.");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Please enter yes or no");
        String input = this.scanner.nextLine();
        return (input.trim().toLowerCase().equalsIgnoreCase("y")) || (input.trim().toLowerCase().equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max ) {
        while (true) {
            System.out.printf("Please enter an integer between %d and %d", min, max);
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            if (num >= min && num <= max) {
                return num;
            }
        }
    }

    public int getInt(){
        System.out.println("Please enter an integer");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        return num;
    }

    public double getDouble(double min, double max ){
        while (true) {
            System.out.printf("Please enter an integer between %f and %f", min, max);
            String input = scanner.nextLine();
            double num = Double.parseDouble(input);
            if (num >= min && num <= max) {
                return num;
            }
        }
    }

    public double getDouble(){
        System.out.println("please enter a number");
        String input = scanner.nextLine();
        return Double.parseDouble(input);
    }



}

