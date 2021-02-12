package robot;
import java.awt.*;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {

        Robot robot = new Robot();

        Color green = new Color(5, 9, 3);

        int x = 500;
        int y = 400;

        while (true) {
            Color pixelColor = robot.getPixelColor(x, y);
            if(pixelColor.equals(green)) {
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            }
        }

    }
}
