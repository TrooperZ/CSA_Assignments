//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong4;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.lang.Character.toUpperCase;

public class PaddleTestTwo extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;

	private boolean[] keys;		//keeps track of what keys are pressed

	public PaddleTestTwo()
	{
		//set up all game variables


		ball = new Ball();
		
		
		
		leftPaddle = new Paddle(10, 300, 10, 100);
		rightPaddle = new Paddle(500, 300, 10, 100);
		



		keys = new boolean[5];


		//set up the Canvas
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);
		leftPaddle.draw(window);
		rightPaddle.draw(window);

		if (ball.getX() <= leftPaddle.getX()+leftPaddle.getWidth()+Math.abs(ball.getXSpeed()) && (ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY()+leftPaddle.getHeight() || ball.getY()+ball.getHeight() >= leftPaddle.getY() && ball.getY()+ball.getHeight() < leftPaddle.getY()+leftPaddle.getHeight())) {
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()-Math.abs(ball.getXSpeed())) {
				ball.setYSpeed(-ball.getYSpeed());
			}
			else{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}

		if (ball.getX() >= rightPaddle.getX()-Math.abs(ball.getXSpeed()) && (ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY()+rightPaddle.getHeight() || ball.getY()+ball.getHeight() >= rightPaddle.getY() && ball.getY()+ball.getHeight() < rightPaddle.getY()+rightPaddle.getHeight())) {
			if (ball.getX() >= rightPaddle.getX()+Math.abs(ball.getXSpeed())) {
				ball.setYSpeed(-ball.getYSpeed());
			}
			else{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}



		if(!(ball.getX()>=5 && ball.getX()<=550))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(!(ball.getY()>=5 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(window);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(window);

		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(window);

		}
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e)
	{
		//no code needed here
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}		
}