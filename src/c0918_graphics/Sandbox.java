package c0918_graphics;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Rectangle;

public class Sandbox {
    public static void main(String[] args) {
        CanvasWindow cw = new CanvasWindow("3 Rec", 1000, 500);

        for(int i=1; i<=100; i++) {
            Rectangle r1 = new Rectangle(100*i, 100*i, 10*i, 5*i);
            r1.setCenter(500, 250);
            cw.add(r1);
        }

    }
}
