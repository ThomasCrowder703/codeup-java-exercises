package collections;

public class Items {
    private String name;
    private int amount;

    public Items(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName(){
        return this.name;
    }

    public int getAmount(){
        return this.amount;
    }

//    public static void main(String[] args) {
//        Items item = new Items("Strawberry",5);
//        System.out.println(item.getName());
//        System.out.println(item.getAmount());
//    }
}
