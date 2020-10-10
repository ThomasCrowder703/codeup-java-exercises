package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
   protected double length;
   protected double width;

   Quadrilateral(double aLength, double aWidth){
      this.length = aLength;
      this.width = aWidth;
   }

   public double getLength(){ //What's the point of the constructor variables if I am going to use "this" in the getter? A:
      return this.length;
   }

   public double getWidth(){
      return this.width;
   }

   //Why are these void?A: I'm not returning/retrieving information, I am setting data. Therefor, no return value
   public abstract void setLength(double aLength); //why does this need a parameter A: You are passing in the value you want to set to the instance.
   public abstract void setWidth(double aWidth);
   }

