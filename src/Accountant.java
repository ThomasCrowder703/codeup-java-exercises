 public class Accountant extends Employee {
    Accountant(String name, String department){
    super(name, department);

    }

    public String work(){
        return ("Finding Loopholes");
    }

     public static void main(String[] args) {
         Employee Alan = new Accountant("Alan", "Accounting");

         Alan.sayHello();
     }
}
