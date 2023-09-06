//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong5;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import static java.lang.Character.toUpperCase;

public class Breakout extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle bottomPaddle;

	private Random rng = new Random();

	private int score = 0;

	private int lives = 4; // set it to lives + 1 b/c lives get reduces in restart and restart runs on 1st frame
	private Block[][] blocks;



	private boolean[] keys;		//keeps track of what keys are pressed

	public Breakout()
	{
		//set up all game variables


		ball = new Ball(350, 720, 3, 2);

		blocks = new Block[7][13];
		int currY = 10;
		for (int i = 0; i < 7; i++){
			int currX = 25;
			for (int j = 0; j < 13; j++){
				blocks[i][j] = new Block(currX, currY, 25, 10);
				currX += 45;
			}
			currY += 30;
		}


		
		
		bottomPaddle = new Paddle(300, 740, 75, 10, 8);



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
	public void reset(Graphics window){
		lives--;
		if (lives == 0){
			System.exit(0);
		}
		window.setColor(Color.white);
		window.fillRect(0, 0, 1000, 1000);
		window.setColor(Color.black);
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 13; j++){
				blocks[i][j].setAlive(true);
				blocks[i][j].draw(window);
			}
		}
		bottomPaddle.setX(300);
		ball.setX(350);
		ball.setY(720);
		int ballXSpeed = (int)(Math.random() * 3)+2;
		int ballYSpeed = (int)(Math.random()*3) +2;
		double xNeg = Math.random();
		double yNeg = Math.random();
		if(xNeg>.5) {
			ballXSpeed = -ballXSpeed;
		}
		if(yNeg >.5) {
			ballYSpeed = -ballYSpeed;
		}


		ball.setYSpeed(ballYSpeed);
		ball.setXSpeed(ballXSpeed);

	}
	public void paint(Graphics window)
	{
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 13; j++){
				blocks[i][j].draw(window);
			}
		}
		window.drawLine(625, 0, 625, 1000);
		ball.moveAndDraw(window);
		bottomPaddle.draw(window);

		window.setColor(Color.white);
		window.fillRect(650, 0, 100, 100);
		window.setColor(Color.black);
		window.drawString("Score", 650, 15);
		window.drawString(" " + score, 700, 15);
		window.drawString("Lives", 650, 35);
		window.drawString(" " + lives, 700, 35);

		

		ball.moveAndDraw(window);
		bottomPaddle.draw(window);

		if (ball.getY() >= bottomPaddle.getY() && (ball.getX() >= bottomPaddle.getX() && ball.getX() <= bottomPaddle.getX()+bottomPaddle.getWidth())) {

			ball.setYSpeed(-ball.getYSpeed());
		}

		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 13; j++){
				if (blocks[i][j].isAlive() && (ball.getX() >= blocks[i][j].getX() && ball.getX() <= blocks[i][j].getX()+blocks[i][j].getWidth()) && (ball.getY() >= blocks[i][j].getY() && ball.getY() <= blocks[i][j].getY()+blocks[i][j].getHeight())) {
					blocks[i][j].setAlive(false);
					score++;

					if ((ball.getX()+ball.getWidth() >= blocks[i][j].getX() || ball.getX() <= blocks[i][j].getX()+blocks[i][j].getWidth()) && ball.getY()+ball.getHeight() >= blocks[i][j].getY() && ball.getY() <= blocks[i][j].getY()+blocks[i][j].getHeight()){
						ball.setXSpeed(-ball.getXSpeed());
					}

					if ((ball.getY()+ball.getHeight() >= blocks[i][j].getY() || ball.getY() <= blocks[i][j].getY()+blocks[i][j].getHeight()) && ball.getX()+ball.getWidth() >= blocks[i][j].getX() && ball.getX() <= blocks[i][j].getX()+blocks[i][j].getWidth()){
						ball.setYSpeed(-ball.getYSpeed());
					}


				}
			}
		}

		if(!(ball.getX()>=0 && ball.getX()<=600))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(ball.getY()<=5)
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		if (ball.getY() >= 750){
			reset(window);
		}

		if(keys[0])
		{
			//move left paddle up and draw it on the window
			bottomPaddle.moveLeftAndDraw(window);
		}
		if(keys[1])
		{
			bottomPaddle.moveRightAndDraw(window);

		}

	}

	public void keyPressed(KeyEvent e)
	{
		switch (toUpperCase(e.getKeyChar())) {
			case 'A' -> keys[0] = true;
			case 'D' -> keys[1] = true;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch (toUpperCase(e.getKeyChar())) {
			case 'A' -> keys[0] = false;
			case 'D' -> keys[1] = false;
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
   		   Thread.currentThread().sleep(20);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}		
}