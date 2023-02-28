package Pong3;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.*;

public class Block
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}

	public Block(int xPos, int yPos, int width, int height){
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		color = Color.BLACK;
	}

	public Block(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}

	public Block(int xPos, int yPos, int width, int height, Color color){
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	
   public void setX(int xPos){
		this.xPos = xPos;
   }

   public void setY(int yPos){
		this.yPos = yPos;
   }

   public void setHeight(int height){
		this.height = height;
   }

   public void setWidth(int width){
		this.width = width;
   }

   public void setColor(Color col)
   {
		color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   


   public int getX(){
		return xPos;
   }
   public int getY(){
		return yPos;
   }
   public int getWidth(){
		return width;
   }
   public int getHeight(){
		return height;
   }
   public Color getColor(){
		return color;
   }

	public boolean equals(Block obj)

	{
		return (this.width == obj.getWidth() && this.height == obj.getHeight() && this.color.equals(obj.getColor()));}

   public String toString(){
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
   }
    

   //add a toString() method  - x , y , width, height, color
}