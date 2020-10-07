public class ArraysLecNotes {
    public static void main(String[] args) {
        double[] prices = new double[3]; //once you create an array, you have to set a size

        prices[0] = 1.0;
        prices[1] = 2.0;
        prices[2] = 3.0;


        System.out.println("prices = " + prices); //prints the address ID, NOT the full Array.

        System.out.println("prices.length = " + prices.length); // number of indexes plus one

//        System.out.println("prices[0] = " + prices[0]);
//        System.out.println("prices[2] = " + prices[2]);

        String[] names = {"Fer", "Douglas", "Daniel"}; // another way to define an array

//        System.out.println("names[0] = " + names[0]);
//        System.out.println("names[2] = " + names[2]);

        for (int i = 0; i < prices.length ;i++){ //for loop will print all the content in the array
            System.out.println("prices[i] = " + prices[i]);
        }

        for (String name: names) { //enhanced for loop/ creates name variable as place holder for individual items in array
            System.out.println("name = " + name);
        }

    }
}
