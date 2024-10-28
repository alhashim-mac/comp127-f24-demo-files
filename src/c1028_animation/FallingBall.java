package c1028_animation;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.events.ModifierKey;

public class FallingBall {
    static double fallDirection = 1;
    public static void main(String[] args) {
        CanvasWindow window = new CanvasWindow("Falling Ball",     500, 500);
        
        Ellipse ball = new Ellipse(window.getWidth()/2, 0, 10, 10);
        window.add(ball);

        window.animate(() -> {
            ball.setY(ball.getY()+fallDirection);
            if(ball.getY() > window.getHeight()) {
                ball.setY(0);
            }
            else if(ball.getY() < 0) {
                ball.setY(window.getHeight());
            }
        });

        window.onMouseDown(e -> {
            if(e.getModifiers().contains(ModifierKey.SHIFT)) 
                fallDirection -= 1;
            else
                fallDirection += 1;
        });
    }
}
