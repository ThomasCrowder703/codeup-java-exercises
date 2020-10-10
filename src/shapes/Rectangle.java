package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    protected double length;
    protected double width;

    Rectangle(double aLength, double aWidth){
        super(aLength, aWidth);
        }

    //exists because defined in interface "Measurable"
    public double getArea(){
        double area = (this.getLength() * this.getWidth());
        System.out.println("Here is the area of your rectangle");
        System.out.println(area);
        return area;
    }
    //exists because defined in interface "Measurable"
    public double getPerimeter(){
        double perimeter = (this.getLength() * 2) + (this.getWidth()* 2);
        System.out.println("Here is the perimeter of your rectangle");
        System.out.println(perimeter);
        return perimeter;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }


}
