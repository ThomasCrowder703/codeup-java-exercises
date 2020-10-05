public class Dish {

    public int costInCents;
    public String nameOfDish;
    public Boolean wouldRecommend;

    public static void main(String[] args) {
        Dish spaghetti = new Dish();
        spaghetti.costInCents = 100;
        spaghetti.nameOfDish = "Spaghetti";
        spaghetti.wouldRecommend = true;
        spaghetti.printSummary();
    }


    public void printSummary(){
        System.out.printf(" Cost: %d \n Name: %s \n Recommended: %b", costInCents, nameOfDish, wouldRecommend);
    }
}
