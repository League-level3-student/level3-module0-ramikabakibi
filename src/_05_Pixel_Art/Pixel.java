package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Graphics;

public class Pixel{
    public int x;
    public int y;
    public Color color;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
        color = Color.WHITE;
    }
    public void draw(Graphics g) {
    	g.setColor(color);
    	g.drawRect(x, y, y, x);
    }
}
