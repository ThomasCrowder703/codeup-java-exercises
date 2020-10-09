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
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(5, 4);
        rectangles[1] = new Square(5); // Why is it not overriding to the Square Methods A: The Square Methods did not need the parameter I was providing.


        for (Rectangle rectangle: rectangles) {
            System.out.println(rectangle.getArea());
            System.out.println(rectangle.getPerimeter());
        }

    }
}
