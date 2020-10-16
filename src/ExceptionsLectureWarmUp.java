import util.Input;

public class ExceptionsLectureWarmUp {
    public static void main(String[] args) {
        exceptions();
    }

    static void exceptions(){
        System.out.println("Starting Code!");
            Input input = new Input();
            int userInt = input.getInt(5,10);
            System.out.println(userInt);
//            double userDouble = input.getDouble(5,8);
//            System.out.println(userDouble);
        System.out.println("Finished Code!");
    }
}
