import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"Green", "Blue", "Red", "Tall", "Wide", "Whimsical", "Disturbed", "Funny", "Boisterous", "Silly"};
   public static String[] nouns = {"Automobile", "Shoe", "Boat", "Dog", "Corn", "Debt Collector", "Rockstar", "Nebula", "Manager", "Kansas"};

    public static void main(String[] args) {

        randomElement(adjectives, nouns);
//        System.out.println(getName(adjectives) + " " + getName(nouns)); walkthrough call

    }


    public static String randomElement(String[] arrayOne, String[] arrayTwo){
        int randomIndex = (int) (Math.random() * (arrayOne.length - 0 +1) -0);
        int randomIndexTwo = (int) (Math.random() * (arrayTwo.length - 0 + 1) - 0);
//        System.out.println(randomIndex);
//        System.out.println(randomIndexTwo);
        String newCombo = arrayOne[randomIndex] + "-" + arrayTwo[randomIndexTwo];
        System.out.println(newCombo);
        return newCombo;
    }

    //walkthrough solution below

//    public static String getName(String[] words){
//        Random rnd = new Random();
//        int randomIndex = rnd.nextInt(words.length);
//        return words[randomIndex];
//    }


}



