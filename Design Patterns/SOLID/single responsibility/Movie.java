import java.util.*;

public class Movie implements Outputable{

    String name, author, genre;
    Integer pageNumber;

    public Movie(String name, String author, String genre, Integer pageNumber) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.pageNumber = pageNumber;
    }
    
    @Override
    public ArrayList<Variable> getInfo() {
        ArrayList<Variable> info = new ArrayList<Variable>();
        info.add(new Variable("String", "name", name));
        info.add(new Variable("String", "author", author));
        info.add(new Variable("String", "genre", genre));
        info.add(new Variable("String", "pageNumber", pageNumber.toString()));
        return info;
    }
    
}
