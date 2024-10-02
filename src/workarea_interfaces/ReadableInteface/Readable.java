package workarea_interfaces.ReadableInteface;

public interface Readable {
    String read();

    default String readDecorate() {
        return "*"+read()+"*";
    }
}
