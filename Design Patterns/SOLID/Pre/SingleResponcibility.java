import java.util.*;

class Book{
    String name;
    String author;
    Integer numpage;

    Book(){}
    Book(String name, String author, int numpage){
        this.name = name;
        this.author = author;
        this.numpage = numpage;
    }

    void show(){
        System.out.println("name: " + name);
        System.out.println("author: " + author);
        System.out.println("num page: " + numpage);
    }
}

class Movie{
    String name;
    int runtime;
    String director;
    double imdb_rating;

    Movie(){}
    Movie(String name, String director, int runtime, double imdb_rating){
        this.name = name;
        this.runtime = runtime;
        this.director = director;
        this.imdb_rating = imdb_rating;
    }

    void show(){
        System.out.println("name: " + name);
        System.out.println("director: " + director);
        System.out.println("runtime: " + runtime);
        System.out.println("imdb_rating: " + imdb_rating);
    }
}

class SingleResponcibility{
    public static void main(String[] args){
        Book book = new Book(
            "Harry Potter and the Deathly Hallows",
            "JK Rowling",
            546
        );

        Movie movie = new Movie(
            "Inception",
            "Christopher Nolan",
            96,
            8.5
        );

        book.show();
        movie.show();
    }
}