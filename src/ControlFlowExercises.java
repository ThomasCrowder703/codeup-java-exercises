public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i++);
//        }
//        int i = 100;
//        System.out.print(i +"\n");
//        do {
//            System.out.println(i -= 5);
//        }while (i > -10);
//        int i = 2;
//        do{
//            System.out.println(i);
//            i = (int) Math.pow(i,2);
//        }while (i < 1000000);

//        for (int i = 5; i<=15;i++){
//            System.out.println(i);
//        }

        for(int i=2; i < 1000000; i = (int) Math.pow(i,2)){
            System.out.println(i);
        }
    }
}
