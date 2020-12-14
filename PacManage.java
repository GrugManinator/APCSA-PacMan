// hey it's Ben!!
// hey Ben!
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class PacManage extends JFrame implements Runnable, KeyListener
{
    Container con = getContentPane();
    Thread t = new Thread(this);
    PackMann p;
    ArrayList<GoldCoin> coins = new ArrayList<GoldCoin>();
    ArrayList<Rectangle> barriers = new ArrayList<Rectangle>();
    ArrayList<GhostMan> ghost = new ArrayList<GhostMan>();
    ArrayList<GhostMan> ghostOuch = new ArrayList<GhostMan>();
    ArrayList<SuperPellet> sp = new ArrayList<SuperPellet>();
    public PacManage()
    {
        p = new PackMann(400, 400);
        coins.add(new GoldCoin(100, 100));
        coins.add(new GoldCoin(200, 100));
        coins.add(new GoldCoin(300, 100));
        coins.add(new GoldCoin(100, 200));
        coins.add(new GoldCoin(200, 200));
        coins.add(new GoldCoin(300, 200));
        coins.add(new GoldCoin(100, 300));
        coins.add(new GoldCoin(200, 300));
        coins.add(new GoldCoin(300, 300));
        sp.add(new SuperPellet(400,600));
        barriers.add(new Rectangle(15, 50, 5, 15));
        barriers.add(new Rectangle(15, 65, 15, 600));
        barriers.add(new Rectangle(174, 105, 80, 60));
        barriers.add(new Rectangle(174, 255, 80, 40));
        ghost.add(new GhostMan(/*400,200,*/Color.red,0,0));
        ghost.add(new GhostMan(/*400,200,*/Color.orange, (int)Math.random()*10-5, (int)Math.random()*10-5));
        ghost.add(new GhostMan(/*400,200,*/(new Color(11, 180, 221)), (int)Math.random()*10-5, (int)Math.random()*10-5));
        ghost.add(new GhostMan(/*400,200,*/(new Color(221, 144, 186)), (int)Math.random()*10-5, (int)Math.random()*10-5));
        ghost.add(new GhostMan(/*400,200,*/(new Color(221, 144, 186)), (int)Math.random()*10-5, (int)Math.random()*10-5));
        con.setLayout(new FlowLayout());
        addKeyListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        t.start();
    }

    public void run()
    {
        try{
            while(true)
            {
                t.sleep(33);//Smaller number == faster, larger == slower
                p.move();
                for(int x = 0; x < ghost.size(); x++)
                {
                    ghost.get(x).move();
                }
                for(int x = 0; x < coins.size(); x++)
                {
                    if(p.getR().intersects(coins.get(x).getR()))
                    {
                        coins.get(x).eatCoin();
                    }
                }
                for(int x = 0; x < barriers.size(); x++)
                {
                    if(p.getR().intersects(barriers.get(x)))
                    {
                        p.moveBack(barriers.get(x));
                    }
                    // if(ghost.getR().intersects(barriers.get(x)))
                    // {
                    // ghost.moveBack(barriers.get(x));
                    // }
                }
                for(int x = 0; x < sp.size(); x++)
                {
                    if(p.getR().intersects(sp.get(x).getR()))
                    {
                        sp.get(x).eatSP();
                    }
                }

                repaint();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void paint(Graphics gr)
    {
        Image i=createImage(getSize().width, getSize().height);
        Graphics2D painter = (Graphics2D)i.getGraphics();
        painter.fillRect(0, 0, 744, 888);
        for(int x = 0; x < coins.size(); x++)
        {
            coins.get(x).drawCoin(painter);
        }
        painter.setColor(Color.blue);
        painter.setStroke(new BasicStroke(4));
        for(int x = 0; x < barriers.size(); x++)
        {
            painter.draw(barriers.get(x));
        }
        for(int x = 0; x < ghost.size(); x++)
        {
            ghost.get(x).drawGhost(painter);
            if(p.getR().intersects(ghost.get(x).getR()))
            {
                ghost.get(x).drawGhostOuch(painter);
            }
        }
        // for(int x = 0; x < ghostOuch.size(); x++)
        // {
        // ghostOuch.get(x).drawGhostOuch(painter);
        // }

        p.drawPacMan(painter);
        painter.dispose();
        gr.drawImage(i, 0, 0, this);
    }

    public static void main(String[] args)
    {
        PacManage frame = new PacManage();
        frame.setSize(744, 888);//determines size of screen
        frame.setVisible(true);
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    public void pacPanic()
    {
        
    }

    public void keyPressed(KeyEvent k){}

    public void keyReleased(KeyEvent k){
        if(k.getKeyCode() == 37){
            p.moveLeft();
        }
        if(k.getKeyCode() == 38){
            p.moveUp();
        }
        if(k.getKeyCode() == 39){
            p.moveRight();
        }
        if(k.getKeyCode() == 40){
            p.moveDown();
        }
    }

    public void keyTyped(KeyEvent k){}
}