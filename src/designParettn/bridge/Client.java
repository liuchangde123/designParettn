package designParettn.bridge;

import designParettn.factory.Color;
import designParettn.factory.GreenColor;

public class Client {
    public static void main(String[] args) {
        Color greenColor = new GreenColor();
        BrushPen bigBrushPen = new BigBrushPen(greenColor);
        bigBrushPen.drawWithColor();
    }
}
