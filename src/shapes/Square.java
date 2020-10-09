package shapes;

public class Square  extends Rectangle{
    public Square(int side){
        super(side,side);
    }


    @Override
    public int getArea(){ //Is this the correct parameter to take in for this method A: No parameter was needed since I used "this"
        System.out.println("Your squares perimeter is: ");
        return (int) Math.pow(this.width,2);
    }

    @Override
    public int getPerimeter(){ //Is this the correct parameter to take in for this method A: No parameter was needed since I used "this"
        System.out.println("Your squares area is: ");
        return 4 * this.width;
    }
}
