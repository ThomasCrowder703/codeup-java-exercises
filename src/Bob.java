import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Wold you like to talk to Bob? [y/N]");
        Scanner sc = new Scanner(System.in);
        String userContinue = sc.nextLine();

      if (userContinue.equalsIgnoreCase("y")){
          System.out.println("Say something to Bob.");
          for(int i =1; i >= 1; i++){
              Scanner scanner = new Scanner(System.in);
              String talkToBob = scanner.nextLine();
              if (talkToBob.endsWith("?")){
                  System.out.println("Sure.");
              }else if(talkToBob.endsWith("!")){
                  System.out.println("Woah, chill out!");
              } else if(talkToBob.equals("")){
                  System.out.println("Fine, be that way!");
              }else{
                  System.out.println("Whatever.");
              }
          }
      }

    }
}
