//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong2;
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
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
       setX(getX()+xSpeed);
	   setY(getY()+xSpeed);
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