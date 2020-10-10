package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4); //See if you can refactor into an array A: Did it.
//        Rectangle box2 = new Square(5); //Why does this only need one parameter now?
//
//        System.out.println("Box 1 area " + box1.getArea());
//        System.out.println("Box 1 perimeter " + box1.getPerimeter());
//
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//
        Measurable[] rectangles = new Measurable[2]; //this is allowed because it is an array of instances, NOT a measurable instance.
        rectangles[0] = new Rectangle(5, 4);
        rectangles[1] = new Square(5); // Why is it not overriding to the Square Methods A: The Square Methods did not need the parameter I was providing.


        for (Measurable rectangle: rectangles) { //I dont need to System.out.print because my methods already do that
            rectangle.getArea();
            rectangle.getPerimeter();

        }

        System.out.println("Testing Setters below: ");

        Quadrilateral setterSquare = new Square(5);

        setterSquare.getArea();

        setterSquare.setLength(6); //using setter to change square values
        setterSquare.getArea(); //I am predicting that the output will be 36.
       // Conclusion: setters may be used to set a value AFTER creation. Is this the purpose of making them abstract? A:







    }
}
