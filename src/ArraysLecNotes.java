import java.util.Arrays;

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

        Arrays.sort(prices);
        Arrays.sort(names);

        System.out.println("Sorted names: " + Arrays.toString(names));
        System.out.println("Sorted prices" + Arrays.toString(prices));

        int[] number = new int[8]; //creates number of indexes
        Arrays .fill( number, 10); //flls each index with 10 value
        System.out.println(Arrays.toString(number)); //to string print

        int[] otherNumbers = new int [8];
        Arrays.fill(otherNumbers, 10);
        System.out.println(Arrays.equals(number, otherNumbers)); //returns a boolean showing that they are equal or not

//        String[] copyOfNames = new String[names.length + 1];
        String[] copyOfNames = Arrays.copyOf(names, names.length + 1); // better way to create copy of array with 1 extra index
        copyOfNames[3] = "Justin"; //assign string value "Justin to extra index
        System.out.println("Arrays.toString(copyOfNames) = " + Arrays.toString(copyOfNames)); //Print out copy of array

        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(matrix[1][0]); //prints 4
        System.out.println(matrix[0][2]); // prints 3

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");


    }
}
