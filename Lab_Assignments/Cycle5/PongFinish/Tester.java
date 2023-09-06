package Pong5;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.*;
import java.awt.*;

public class Tester extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;

	public Tester()
	{
		super("PONG TESTER");
		setSize(WIDTH,HEIGHT);

		getContentPane().add(new BlockTestTwo());

		//uncomment when you are ready to test the Ball
		getContentPane().add(new BallTestTwo());

		Breakout padTest = new Breakout();
		((Component)padTest).setFocusable(true);
		getContentPane().add(padTest);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		Tester run = new Tester();
	}
}