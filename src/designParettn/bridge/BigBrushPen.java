package designParettn.bridge;

import designParettn.factory.Color;

public class BigBrushPen implements BrushPen {
    private Color color;

    public BigBrushPen(Color color) {
        this.color = color;
    }

    @Override
    public void drawWithColor() {
        System.out.println("使用"+this.color.showColor()+"粗毛笔写字");
    }
}
