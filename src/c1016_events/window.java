package c1016_events;

import edu.macalester.graphics.CanvasWindow;

public class window {
    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Event Demo", 500, 500);
        canvas.onCharacterTyped(t -> System.out.println("Key pressed: " + t));
        canvas.onMouseDown(e -> System.out.println("Mouse down @ " + e.getPosition()));
        canvas.onMouseUp(e -> System.out.println("Mouse up @ " + e.getPosition()));
        canvas.onMouseMove(e -> System.out.println("Mouse move @ " + e.getPosition()));
        canvas.onDrag(e -> System.out.println("Mouse drag @ " + e.getPosition()));
    }
}
