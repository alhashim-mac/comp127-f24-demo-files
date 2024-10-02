package workarea_interfaces.InterfaceInABox;

public class Book implements Packable {
    final String author;
    final String title;
    final double weight;

    public Book(String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.title;
    }
}
