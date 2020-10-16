package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
//        System.out.println("Enter a string.");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
//        System.out.println("Please enter yes or no");
        String input = this.scanner.nextLine();
        return (input.trim().toLowerCase().equalsIgnoreCase("y")) || (input.trim().toLowerCase().equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max ) {
        while (true) {
            System.out.printf("Please enter an integer between %d and %d\n", min, max);
            String input = this.getString();
            int num;
            try{
                num = Integer.parseInt(input);
            }catch (NumberFormatException numberFormat){
                System.err.println(numberFormat);
                System.err.println("The value you entered was not an integer,please try again.");
                return this.getInt(min, max);
            }
            if (num >= min && num <= max) {
                return num;
            }
        }
    }

    public int getInt(){
        System.out.println("Please enter an integer: ");
        String input = this.getString();
           int num;
           try{

                num = Integer.parseInt(input);
           }catch(NumberFormatException numberFormat){
               System.err.println(numberFormat);
               System.err.println("The value you entered was not an integer,please try again.");
               return this.getInt();
           }
           return num;
       }



    public double getDouble(double min, double max ){
        while (true) {
            System.out.printf("Please enter an double between %f and %f\n", min, max);
            String input = this.getString();;
            double num;
            try{
                num = Double.parseDouble(input);
            }catch (NumberFormatException numberFormat){
                System.err.println(numberFormat);
                System.err.println("The value you entered was not an integer,please try again.");
                return this.getDouble(min,max);
            }
            if (num >= min && num <= max) {
                return num;
            }
        }
    }

    public double getDouble(){
        System.out.println("please enter a double");
        String input = this.getString();
        double num;
         try{
             num = Double.parseDouble(input);
         }catch (NumberFormatException numberFormat){
             System.err.println(numberFormat);
             System.err.println("The value you entered was not a double. Please try again.");
             return this.getDouble();
         }
         return num;
    }



}

