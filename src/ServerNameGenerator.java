public class ServerNameGenerator {


    public static void main(String[] args) {
        String[] adjectives = {"Green", "Blue", "Red", "Tall", "Wide", "Whimsical", "Disturbed", "Funny", "Boisterous", "Silly"};
        String[] nouns = {"Automobile", "Shoe", "Boat", "Dog", "Corn", "Debt Collector", "Rockstar", "Nebula", "Manager", "Kansas"};
        randomElement(adjectives, nouns);

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
}



