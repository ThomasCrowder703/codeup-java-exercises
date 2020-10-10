package shapes;

public class Square extends Quadrilateral implements Measurable{
    Square(double side){ //this is the parameter I will pass in when I create a new instance of a square
        super(side, side); //this has "side" twice because all sides on a square are equivalent
    }

    // these are the methods that will run in test to get the perimeter and area. They have to exist because they are included in the measurable interface
    @Override
    public double getArea(){
        double area = Math.pow(this.length, 2);
        System.out.println("Here is the area of your square");
        System.out.println(area);
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = (this.length *4);
        System.out.println("Here is the perimeter of your square");
        System.out.println(perimeter);
        return perimeter;
    }


    // these are the methods that get the length and width from creating a new instance of a Square as a quadrilateral object
    public double getLength() {
        System.out.println("Here is the length of your square");

        return super.getLength(); //the super inherits the equation used in Quadrilaterals.java
    }


    public double getWidth() {
        System.out.println("Where is the width of your square");;
        return super.getWidth();  //the super inherits the equation used in Quadrilaterals.java
    }


@Override
    public void setLength(double aLength) {
         this.length = aLength;
         this.width = aLength;
    }

@Override
    public void setWidth(double aWidth) {
         this.width = aWidth;
         this.length = aWidth;
    }


}
