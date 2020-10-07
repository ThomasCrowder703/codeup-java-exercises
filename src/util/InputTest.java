package util;

public class InputTest {
   public static void main(String[] args) {
        Input input = new Input();

       System.out.println(input.getString());

        if(input.yesNo()){
            System.out.println("It returned true");
        }else{
            System.out.println("It returned false");
        }

       System.out.println(input.getInt(10, 50));
       System.out.println(input.getInt());
       System.out.println(input.getDouble(10, 50));
       System.out.println(input.getDouble());

    }
}
