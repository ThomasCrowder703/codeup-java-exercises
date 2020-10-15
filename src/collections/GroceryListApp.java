package collections;
import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GroceryListApp {

    public static void main(String[] args) {
        Input input = new Input();

        HashMap<String,Items> shoppingList = new HashMap<>();
        System.out.println("Would you like to create/modify the grocery list?");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")){
            do {
                System.out.println("Please add an item.(Choose a type first)");
                System.out.println("Food/Tools/Recreation/Music/Cleaning");
                String userType = scan.nextLine();
                System.out.println("Please Enter your item");
                String userItem = scan.nextLine();
                System.out.println("Please enter the amount of this item you'd like");
                int userItemAmount = scan.nextInt();
                Items item = new Items(userItem, userItemAmount);
                System.out.printf("You would like to purchase [%s] and the amount you want is %d. Please type 'yes' to confirm or 'no' to restart\n", userItem, userItemAmount);
                shoppingList.putIfAbsent(userType,item);
            }while (!input.yesNo());

        }else{
            System.exit(0);
        }
    }



}
