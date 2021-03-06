import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class SuperPellet
{
    private Color c;
    private int x, y;
    private Rectangle r;
    private boolean visible;
    public SuperPellet(int xx, int yy)
    {
        c = Color.white;
        x = xx;
        y = yy;
        visible = true;
        r = new Rectangle(x, y, 20, 20);
    }

    public Rectangle getR()
    {
        return r;
    }

    public void drawCoin(Graphics2D gr)
    {
        gr.setColor(c);
        if(visible)
            gr.fillOval(x, y, 20, 20);
    }

    public void eatSP()
    {
        visible = false;
        r = new Rectangle(0,0,0,0);
    }

    
}
