//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong5;

import java.awt.*;
import java.util.Random;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;
	private Random rng = new Random();

	public Ball()
	{
		super(250,250);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y){
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;

	}

	public Ball(int x, int y, int xSpeed, int ySpeed){
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public Ball(int x, int y, int xSpeed, int ySpeed, Color color){
		super(x,y);
		super.setColor(color);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public Ball(int x, int y, int w, int h, Color color, int xSpeed, int ySpeed){
		super(x,y, w, h, color);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public Ball(int x, int y, int w, int h, int xSpeed, int ySpeed){
		super(x,y, w, h, Color.BLACK);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void setXSpeed(int xSpeed){
		this.xSpeed = xSpeed;

	}

	public void setYSpeed(int ySpeed){
		this.ySpeed = ySpeed;
	}


   public void moveAndDraw(Graphics window)
   {

	   Color curColor = super.getColor();
	   super.setColor(Color.WHITE);
	   super.draw(window);


	   super.setColor(curColor);
       super.setX(super.getX()+xSpeed);
	   super.setY(super.getY()+ySpeed);
	   super.draw(window);

   }
   
   public boolean equals(Ball obj)
	{
		return (super.equals(obj) && this.xSpeed == obj.xSpeed && this.ySpeed == obj.ySpeed);
	}   

   public int getXSpeed(){
		return xSpeed;
   }

   public int getYSpeed(){
		return ySpeed;
   }

   public String toString(){
		return super.getX()+" "+super.getY() + xSpeed + " " + ySpeed + " " + super.getColor();
   }
}