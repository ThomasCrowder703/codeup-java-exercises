package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int lengthInput, int widthInput){
        this.length = lengthInput;
        this.width = widthInput;
    }

    public int getArea(){
        return this.length * this.width;
    }


    public int getPerimeter(){
        return (this.length*2) + (this.width * 2);
    }
}
