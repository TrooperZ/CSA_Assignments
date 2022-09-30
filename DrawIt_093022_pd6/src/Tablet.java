//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;

import static java.lang.System.*;

public class Tablet extends JPanel implements KeyListener, Runnable
{
    private boolean[] keys;

    private int x;
    private int y;

    public Tablet(JFrame par)
    {
        //the keys array will store the key presses
        //[0]=left arrow
        //[1]=right arrow
        //[2]=up arrow
        //[3]=down arrow
        //[4]=space bar
        keys = new boolean[5];

        setBackground(Color.BLACK);

        //x and y will keep track of where the pen is
        //on the screen
        x = DrawIt.WIDTH/2;
        y = DrawIt.HEIGHT/2;

        this.addKeyListener(this);
        new Thread(this).start();

        setVisible(true);
    }

    public void update(Graphics window)
    {
        paint(window);
    }

    public void paint( Graphics window )
    {
        window.setColor( Color.WHITE );
        window.setFont(new Font("TAHOMA",Font.BOLD,18));
        window.drawString("A+ Draw a Shape", 20,20);
        window.drawString("Use the arrow keys to draw.", 20,40);
        window.drawString("Use the space bar to clear the screen.", 20,60);

        //add in code to move the x and y
        if (keys[2])
            y--;
        else if (keys[3])
            y++;

        if (keys[1])
            x++;
        else if (keys[0])
            x--;

        if (keys[4]) {
            x = DrawIt.WIDTH / 2;
            y = DrawIt.HEIGHT / 2;
            window.setColor(Color.BLACK);
            window.fillRect(0, 0, DrawIt.WIDTH, DrawIt.HEIGHT);
        }

        //if the up arrow was pressed
        //take 1 away from y value

        //if the down arrow was pressed
        //add 1 to the y value

        //if the left array was pressed
        //take 1 away from x valye

        //if the right arrow was pressed
        //add 1 to the y value

        //if the space bar was pressed
        //reset x and y to the center
        //draw a black rectangle the size of the screen

        window.setColor( Color.WHITE );
        window.fillRect(x, y, 2, 2);
    }


    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            keys[0] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            keys[1] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            keys[2] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            keys[3] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            keys[4] = true;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            keys[0] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            keys[1] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            keys[2] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            keys[3] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            keys[4] = false;
        }
        //repaint();
    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void run()
    {
        try
        {
            while(true)
            {
                Thread.currentThread().sleep(5);
                repaint();
            }
        }catch(Exception e)
        {
        }
    }
}

