//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong4;

import java.awt.*;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }

   public Paddle(int x, int y)
   {
      super(x,y);
      speed =5;
   }

   public Paddle(int x, int y, int speed)
   {
      super(x,y);
      this.speed =speed;
   }

   public Paddle(int x, int y, int width, int height)
   {
      super(x,y, width, height);
      this.speed =5;
   }

   public Paddle(int x, int y, int width, int height, int speed)
   {
      super(x,y, width, height);
      this.speed =speed;
   }

   public Paddle(int x, int y, int width, int height, Color color, int speed)
   {
      super(x,y, width, height, color);
      this.speed =speed;
   }




   //add the other Paddle constructors

   public void moveUpAndDraw(Graphics window)
   {
      if (!(super.getY() <= 10)) {
         Color curColor = super.getColor();
         super.setColor(Color.WHITE);
         super.draw(window);


         super.setColor(curColor);
         setY(getY() - speed);
         super.draw(window);
      }
   }

   public void moveDownAndDraw(Graphics window)
   {
      if (!(super.getY() >= 450)) {
         Color curColor = super.getColor();
         super.setColor(Color.WHITE);
         super.draw(window);


         super.setColor(curColor);
         setY(getY() + speed);
         super.draw(window);
      }
   }

   public int getSpeed(){
      return speed;
   }

   public void setSpeed(int speed){
      this.speed = speed;
   }


   
   
   public String toString(){
      return super.toString() + " " + speed;
   }
}