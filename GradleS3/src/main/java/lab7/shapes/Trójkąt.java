package lab7.shapes;

import java.awt.*;
import java.awt.Shape;

public class Trójkąt extends Shape {
    public int a;
    private int x[] = {10,110,60};
    private int y[] = {120,120,35};
    public Trójkąt(String _name, int _a) {
        name = _name;
        a = _a;
    }

    public void draw(Graphics graphics){
        graphics.setColor(new Color(0,255,0));
        graphics.fillPolygon(new Polygon(x,y,3));

    }


    @Override
    public boolean pressed(int mousePositionX, int mousePositionY) {
        return (mousePositionX >= positionX && mousePositionX <= positionX+a && mousePositionY >= positionY && mousePositionY <= positionY + a);
    }
}