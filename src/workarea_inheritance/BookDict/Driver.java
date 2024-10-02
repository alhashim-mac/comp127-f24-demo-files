package workarea_inheritance.BookDict;

public class Driver {
    public static void main(String[] args) {
        Book b = new Dictionary();
        System.out.println(b.getISBN());
        System.out.println(((Dictionary) b).getDefinition());
    }
}
