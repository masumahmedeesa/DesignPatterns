
public class SingleResponsibility {
    public static void main(String[] args) {
        Book book = new Book("Mother", "Maxim Gurki", "hello World", 500);
        Outputer out = new Outputer(book);
        out.showJSON();
    }
    
}
