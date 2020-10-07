package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        int counter = 0;
        do {
            counter++;
            double rad = input.getDouble();
            Circle userCircle = new Circle(rad);
            System.out.println("Your circles area is = " + userCircle.getArea());
            System.out.println("Your circles circumference is = " + userCircle.getCircumference());
            System.out.println("Would you like to continue?");
        } while (input.yesNo());
        if(counter == 1){
            System.out.printf("You entered a value %d time", counter);
        }else{
            System.out.printf("You entered a value %d times", counter);
        }

    }
}


