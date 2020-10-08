package movies;
import java.util.Scanner;

public class Movie {
    private String name;
    private String category;

    public Movie(String arg1, String arg2){
        this.name = arg1;
        this.category = arg2;
    }

    public String getMovieName(){
        return this.name;
    }

    public String getMovieCategory(){
        return this.category;
    }

    public String changeName(){
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        System.out.println("What is the name of your movie?");
        return userInput;
    }

    public String changeCategory(){
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        System.out.println("What is the category of your movie?");
        return userInput;
    }
}
