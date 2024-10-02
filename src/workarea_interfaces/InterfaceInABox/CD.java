package workarea_interfaces.InterfaceInABox;

public class CD implements Packable {
    final String artist;
    final String name;
    final int publicationYear;
    final double weight = 0.1;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + "(" + this.publicationYear + ")";
    }
    
}
