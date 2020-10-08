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

    public void changeName(String aName){
        this.name = aName;
    }

    public void changeCategory(String aCategory){
        this.name = aCategory;
    }
}
