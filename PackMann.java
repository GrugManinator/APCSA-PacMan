import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class PackMann
{
    private Color c;
    private int x, y, arcAngle, xv, yv, mouth;
    private Rectangle r;
    public PackMann(int xx, int yy)
    {
        c = Color.yellow;
        x = xx;
        y = yy;
        xv = 10;
        yv = 0;
        mouth = 6;
        arcAngle = 321;
        r = new Rectangle(x, y, 50, 50);
    }

    public Rectangle getR()
    {
        return r;
    }

    public void drawPacMan(Graphics2D gr)
    {
        gr.setColor(c);
        if(xv>0)
            gr.fillArc(x, y, 50, 50, 0, arcAngle);
        if(xv<0)
            gr.fillArc(x, y, 50, 50, 180, arcAngle);
        if(yv>0)
            gr.fillArc(x, y, 50, 50, 270, arcAngle);
        if(yv<0)
            gr.fillArc(x, y, 50, 50, 90, arcAngle);

        arcAngle += mouth;
        if(arcAngle >360 || arcAngle<320)
            mouth *= -1;
    }

    public void move()
    {
        x += xv;
        y += yv;
        r.setLocation(x, y);
    }

    public void moveUp()
    {
        xv = 0;
        yv = -10;
    }

    public void moveDown()
    {
        xv = 0;
        yv = 10;
    }

    public void moveLeft()
    {
        xv = -10;
        yv = 0;
    }

    public void moveRight()
    {
        xv = 10;
        yv = 0;
    }

    public Rectangle moveBack(Rectangle z)
    {
        if(r.intersects(z))
        {
            x-=xv;
            y-=yv;
        }
        return z;
    }
    
    
}
