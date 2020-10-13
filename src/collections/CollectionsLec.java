package collections;
import java.util.ArrayList;

public class CollectionsLec {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size()); //returns 0 value
        names.add("Fernando");
        System.out.println(names.size()); //returns 1 value
        names.add("Daniel");
        names.add("Kenneth");

        System.out.println(names.get(0));

        System.out.println(names.indexOf("Kenneth")); // returns 2

        System.out.println(names.get(2).toUpperCase()); // returns "KENNETH"
        System.out.println(names.get(names.indexOf("Kenneth")).toUpperCase());// returns "KENNETH"

        if(names.contains("Kenneths")) {
            System.out.println(names.get(names.indexOf("Kenneth")).toUpperCase());
        } //will not print if false instead of breaking the app



    }
}
