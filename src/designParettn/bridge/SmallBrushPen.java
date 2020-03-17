package designParettn.bridge;

import designParettn.factory.Color;

public class SmallBrushPen implements BrushPen {
    private Color color;

    public SmallBrushPen(Color color) {
        this.color = color;
    }

    @Override
    public void drawWithColor() {
        System.out.println("使用"+this.color.showColor()+"细毛笔写字");
    }
}
