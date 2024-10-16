package c1016_events;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.events.MouseButtonEvent;
import edu.macalester.graphics.events.MouseButtonEventHandler;

public class window {
    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Event Demo", 500, 500);
        
        /*
         * void onMouseDown(MouseButtonEventHandler handler)
         * Adds a listener that will receive an event when the mouse button goes down inside the window.
         * 
         * What is MouseButtonEventHandler?
         * What is the lamda expression implementing?
         */

        /* Lamda expression with syntactic sugar */
        canvas.onMouseDown(e -> System.out.println("Mouse down @ " + e.getPosition()));
        
        /* Lamda expression without syntactic sugar */
        // canvas.onMouseDown((MouseButtonEvent e) -> {
        //     System.out.println("Mouse down @ " + e.getPosition());
        // });

        /* Ananynimous class */
        // canvas.onMouseDown(new MouseButtonEventHandler() {
        //     public void handleEvent (MouseButtonEvent e) {
        //         System.out.println("Mouse down @ " + e.getPosition());
        //     }
        // });

        /* Inner class */
        // class MBEHClass implements MouseButtonEventHandler {
        //     @Override
        //     public void handleEvent(MouseButtonEvent e) {
        //         System.out.println("Mouse down @ " + e.getPosition());
        //     }
        // }
        // canvas.onMouseDown(new MBEHClass());
        
        
        /*
         * Similar methods
         */
        // canvas.onMouseUp(e -> System.out.println("Mouse up @ " + e.getPosition()));
        // canvas.onMouseMove(e -> System.out.println("Mouse move @ " + e.getPosition()));
        // canvas.onDrag(e -> System.out.println("Mouse drag @ " + e.getPosition()));
        // canvas.onCharacterTyped(t -> System.out.println("Key pressed: " + t));
    }
}
