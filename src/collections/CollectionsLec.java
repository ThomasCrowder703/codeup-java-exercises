package collections;
import java.util.ArrayList;

public class CollectionsLec {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size()); //returns 0 value
        names.add("Fernando");
        System.out.println(names.size()); //returns 1 value

        System.out.println(names.get(0));
        System.out.println(names.get(1));// does not exist
    }
}
