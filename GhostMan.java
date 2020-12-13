import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class GhostMan
{
    private Color cc;
    private int x, y, arcAngle, xv, yv, mouth;
    private Rectangle r;
    private boolean b = true;
    public GhostMan(/*int xx, int yy,*/ Color c, int xxv, int yyv)
    {
        cc = c;
        // xx = x;
        // yy = y;
        x = 400;
        y = 400;
        xv = xxv;
        yv = yyv;
        r = new Rectangle(x-20,y,28,28);

    }

    public Rectangle getR()
    {
        return r;
    }

    public void drawGhost(Graphics2D gr)
    {

        if(yv>0)
        {gr.setColor(cc);
            gr.fillRect(x, y, 8, 2);
            gr.fillRect(x-4, y+2, 16, 2);
            gr.fillRect(x-6, y+4, 20, 2);
            gr.fillRect(x-8, y+6, 6, 2);
            gr.fillRect(x+2, y+6, 8, 2);
            gr.fillRect(x+14, y+6, 2, 2);
            gr.fillRect(x-8, y+8, 4, 2);
            gr.fillRect(x+4, y+8, 4, 2);
            gr.fillRect(x-10, y+10, 6, 2);
            gr.fillRect(x+4, y+10, 4, 2);
            gr.fillRect(x+16, y+10, 2, 2);
            gr.fillRect(x-10, y+12, 6, 2);
            gr.fillRect(x+4, y+12, 4, 2);
            gr.fillRect(x+16, y+12, 2, 2);
            gr.fillRect(x-10, y+14, 8, 2);
            gr.fillRect(x+2, y+14, 8, 2);
            gr.fillRect(x+14, y+14, 4, 2);
            gr.fillRect(x-10, y+16, 28, 2);
            gr.fillRect(x-10, y+18, 28, 2);
            gr.fillRect(x-10, y+20, 28, 2);
            gr.fillRect(x-10, y+22, 28, 2);
            gr.fillRect(x-10, y+24, 4, 2);
            gr.fillRect(x-4, y+24, 6, 2);
            gr.fillRect(x+6, y+24, 6, 2);
            gr.fillRect(x+14, y+24, 4, 2);
            gr.fillRect(x-10, y+26, 2, 2);
            gr.fillRect(x-2, y+26, 4, 2);
            gr.fillRect(x+6, y+26, 4, 2);
            gr.fillRect(x+16, y+26, 2, 2);

            gr.setColor(Color.white);
            gr.fillRect(x-2, y+6, 4, 2);
            gr.fillRect(x+10, y+6, 4, 2);
            gr.fillRect(x-4, y+8, 8, 2);
            gr.fillRect(x+8, y+8, 8, 2);
            gr.fillRect(x-4, y+10, 4, 2);
            gr.fillRect(x+8, y+10, 4, 2);
            gr.fillRect(x-4, y+12, 4, 2);
            gr.fillRect(x+8, y+12, 4, 2);
            gr.fillRect(x-2, y+14, 4, 2);
            gr.fillRect(x+10, y+14, 4, 2);

            gr.setColor(new Color(10, 121, 254));
            gr.fillRect(x, y+10, 4, 2);
            gr.fillRect(x+12, y+10, 4, 2);
            gr.fillRect(x, y+12, 4, 2);
            gr.fillRect(x+12, y+12, 4, 2);
        }

        else if(xv>0)
        {
            gr.fillRect(x, y, 8, 2);
            gr.fillRect(x-4, y+2, 16, 2);
            gr.fillRect(x-6, y+4, 20, 2);
            gr.fillRect(x-8, y+6, 6, 2);
            gr.fillRect(x+2, y+6, 8, 2);
            gr.fillRect(x+14, y+6, 2, 2);
            gr.fillRect(x-8, y+8, 4, 2);
            gr.fillRect(x+4, y+8, 4, 2);
            gr.fillRect(x-10, y+10, 6, 2);
            gr.fillRect(x+4, y+10, 4, 2);
            gr.fillRect(x+16, y+10, 2, 2);
            gr.fillRect(x-10, y+12, 6, 2);
            gr.fillRect(x+4, y+12, 4, 2);
            gr.fillRect(x+16, y+12, 2, 2);
            gr.fillRect(x-10, y+14, 8, 2);
            gr.fillRect(x+2, y+14, 8, 2);
            gr.fillRect(x+14, y+14, 4, 2);
            gr.fillRect(x-10, y+16, 28, 2);
            gr.fillRect(x-10, y+18, 28, 2);
            gr.fillRect(x-10, y+20, 28, 2);
            gr.fillRect(x-10, y+22, 28, 2);
            gr.fillRect(x-10, y+24, 4, 2);
            gr.fillRect(x-4, y+24, 6, 2);
            gr.fillRect(x+6, y+24, 6, 2);
            gr.fillRect(x+14, y+24, 4, 2);
            gr.fillRect(x-10, y+26, 2, 2);
            gr.fillRect(x-2, y+26, 4, 2);
            gr.fillRect(x+6, y+26, 4, 2);
            gr.fillRect(x+16, y+26, 2, 2);

            gr.setColor(Color.white);
            gr.fillRect(x-2, y+6, 4, 2);
            gr.fillRect(x+10, y+6, 4, 2);
            gr.fillRect(x-4, y+8, 8, 2);
            gr.fillRect(x+8, y+8, 8, 2);
            gr.fillRect(x-4, y+10, 8, 2);
            gr.fillRect(x+8, y+10, 8, 2);
            gr.fillRect(x-4, y+12, 2, 2);
            gr.fillRect(x+2, y+12, 2, 2);
            gr.fillRect(x+8, y+12, 2, 2);
            gr.fillRect(x+12, y+12, 2, 2);

            gr.setColor(new Color(10, 121, 254));
            gr.fillRect(x-4, y+10, 4, 2);
            gr.fillRect(x+8, y+10, 4, 2);
            gr.fillRect(x-4, y+12, 4, 2);
            gr.fillRect(x+8, y+12, 4, 2);
        }
        else if(yv>0)
        {
            gr.fillRect(x, y, 8, 2);
            gr.fillRect(x, y+2, 4, 2);
            gr.fillRect(x-4, y+2, 4, 2);
            gr.fillRect(x-10, y+4, 2, 2);
            gr.fillRect(x-4, y+2, 4, 2);

            gr.fillRect(x-10, y+16, 28, 2);
            gr.fillRect(x-10, y+18, 28, 2);
            gr.fillRect(x-10, y+20, 28, 2);
            gr.fillRect(x-10, y+22, 28, 2);
            gr.fillRect(x-10, y+24, 4, 2);
            gr.fillRect(x-4, y+24, 6, 2);
            gr.fillRect(x+6, y+24, 6, 2);
            gr.fillRect(x+14, y+24, 4, 2);
            gr.fillRect(x-10, y+26, 2, 2);
            gr.fillRect(x-2, y+26, 4, 2);
            gr.fillRect(x+6, y+26, 4, 2);
            gr.fillRect(x+16, y+26, 2, 2);

            gr.setColor(Color.white);
            gr.fillRect(x-2, y+6, 4, 2);
            gr.fillRect(x+10, y+6, 4, 2);
            gr.fillRect(x-4, y+8, 8, 2);
            gr.fillRect(x+8, y+8, 8, 2);
            gr.fillRect(x-4, y+10, 8, 2);
            gr.fillRect(x+8, y+10, 8, 2);
            gr.fillRect(x-4, y+12, 2, 2);
            gr.fillRect(x+2, y+12, 2, 2);
            gr.fillRect(x+8, y+12, 2, 2);
            gr.fillRect(x+12, y+12, 2, 2);

            gr.setColor(new Color(10, 121, 254));
            gr.fillRect(x-4, y+2, 4, 2);
            gr.fillRect(x-4, y+4, 4, 2);
            gr.fillRect(x+20, y+2, 4, 2);
            gr.fillRect(x+20, y+4, 4, 2);
        }
        gr.draw(r);
    }

    public void drawGhostOuch(Graphics2D gr)
    {
        
        if(b)
        {
            gr.setColor(Color.blue);
            gr.fillRect(x, y, 8, 2);
            gr.fillRect(x-4, y+2, 16, 2);
            gr.fillRect(x-6, y+4, 20, 2);
            gr.fillRect(x-8, y+6, 24, 2);
            gr.fillRect(x-8, y+8, 24, 2);
            gr.fillRect(x-8, y+10, 6, 2);
            gr.fillRect(x+2, y+10, 4, 2);
            gr.fillRect(x+10, y+10, 6, 2);
            gr.fillRect(x-10, y+12, 8, 2);
            gr.fillRect(x+2, y+12, 4, 2);
            gr.fillRect(x+10, y+12, 8, 2);
            gr.fillRect(x-10, y+14, 28, 2);
            gr.fillRect(x-10, y+16, 28, 2);
            gr.fillRect(x-10, y+18, 4, 2);
            gr.fillRect(x-2, y+18, 4, 2);
            gr.fillRect(x+6, y+18, 4, 2);
            gr.fillRect(x+14, y+18, 4, 2);
            gr.fillRect(x-10, y+20, 2, 2);
            gr.fillRect(x-6, y+20, 4, 2);
            gr.fillRect(x+2, y+20, 4, 2);
            gr.fillRect(x+10, y+20, 4, 2);
            gr.fillRect(x+16, y+20, 2, 2);
            gr.fillRect(x-10, y+22, 4, 2);
            gr.fillRect(x-6, y+22, 4, 2);
            gr.fillRect(x+6, y+22, 4, 2);
            gr.fillRect(x+14, y+22, 4, 2);
            gr.fillRect(x-10, y+22, 28, 2);
            gr.fillRect(x-10, y+24, 4, 2);
            gr.fillRect(x-4, y+24, 6, 2);
            gr.fillRect(x+6, y+24, 6, 2);
            gr.fillRect(x+14, y+24, 4, 2);
            gr.fillRect(x-10, y+26, 2, 2);
            gr.fillRect(x-2, y+26, 4, 2);
            gr.fillRect(x+6, y+26, 4, 2);
            gr.fillRect(x+16, y+26, 2, 2);

            gr.setColor(Color.white);
            gr.fillRect(x-2, y+10, 4, 2);
            gr.fillRect(x+6, y+10, 4, 2);
            gr.fillRect(x-2, y+12, 4, 2);
            gr.fillRect(x+6, y+12, 4, 2);
            gr.fillRect(x-6, y+18, 4, 2);
            gr.fillRect(x+2, y+18, 4, 2);
            gr.fillRect(x+10, y+18, 4, 2);
            gr.fillRect(x-8, y+20, 2, 2);
            gr.fillRect(x-2, y+20, 4, 2);
            gr.fillRect(x+6, y+20, 4, 2);
            gr.fillRect(x+14, y+20, 2, 2);

        }
        else
        {
            gr.setColor(Color.white);
            gr.fillRect(x, y, 8, 2);
            gr.fillRect(x-4, y+2, 16, 2);
            gr.fillRect(x-6, y+4, 20, 2);
            gr.fillRect(x-8, y+6, 24, 2);
            gr.fillRect(x-8, y+8, 24, 2);
            gr.fillRect(x-8, y+10, 6, 2);
            gr.fillRect(x+2, y+10, 4, 2);
            gr.fillRect(x+10, y+10, 6, 2);
            gr.fillRect(x-10, y+12, 8, 2);
            gr.fillRect(x+2, y+12, 4, 2);
            gr.fillRect(x+10, y+12, 8, 2);
            gr.fillRect(x-10, y+14, 28, 2);
            gr.fillRect(x-10, y+16, 28, 2);
            gr.fillRect(x-10, y+18, 4, 2);
            gr.fillRect(x-2, y+18, 4, 2);
            gr.fillRect(x+6, y+18, 4, 2);
            gr.fillRect(x+14, y+18, 4, 2);
            gr.fillRect(x-10, y+20, 2, 2);
            gr.fillRect(x-6, y+20, 4, 2);
            gr.fillRect(x+2, y+20, 4, 2);
            gr.fillRect(x+10, y+20, 4, 2);
            gr.fillRect(x+16, y+20, 2, 2);
            gr.fillRect(x-10, y+22, 4, 2);
            gr.fillRect(x-6, y+22, 4, 2);
            gr.fillRect(x+6, y+22, 4, 2);
            gr.fillRect(x+14, y+22, 4, 2);
            gr.fillRect(x-10, y+22, 28, 2);
            gr.fillRect(x-10, y+24, 4, 2);
            gr.fillRect(x-4, y+24, 6, 2);
            gr.fillRect(x+6, y+24, 6, 2);
            gr.fillRect(x+14, y+24, 4, 2);
            gr.fillRect(x-10, y+26, 2, 2);
            gr.fillRect(x-2, y+26, 4, 2);
            gr.fillRect(x+6, y+26, 4, 2);
            gr.fillRect(x+16, y+26, 2, 2);

            gr.setColor(Color.red);
            gr.fillRect(x-2, y+10, 4, 2);
            gr.fillRect(x+6, y+10, 4, 2);
            gr.fillRect(x-2, y+12, 4, 2);
            gr.fillRect(x+6, y+12, 4, 2);
            gr.fillRect(x-6, y+18, 4, 2);
            gr.fillRect(x+2, y+18, 4, 2);
            gr.fillRect(x+10, y+18, 4, 2);
            gr.fillRect(x-8, y+20, 2, 2);
            gr.fillRect(x-2, y+20, 4, 2);
            gr.fillRect(x+6, y+20, 4, 2);
            gr.fillRect(x+14, y+20, 2, 2);

        }
        b = !b;
    }

    public void move()
    {
        x += xv;
        y += yv;
        r.setLocation(x, y);
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
