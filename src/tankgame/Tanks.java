package tankgame;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Tanks extends JFrame
{
	String	  back, top, base, tread;

	TankPaint	mainPanel;

	public Tanks()
	{
		top = "top 1";
		base = "base 1";
		tread = "tread 1";
		back = "map8.gif";

		setBackground(Color.blue);

		mainPanel = new TankPaint(back, top + ".gif", base + ".gif", tread + ".gif");
                Point p = new Point(0,0);
		Image pointer = Toolkit.getDefaultToolkit().getImage(Option.imageDir + Option.FILE_SEPARATOR + "pointer.gif");
		Cursor redicalCursor = Toolkit.getDefaultToolkit().createCustomCursor(pointer, p, "redicalcursor");
		mainPanel.setCursor(redicalCursor);
		this.add(mainPanel);
	}

	public static void main(String[] args)
	{
		Tanks f = new Tanks();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1280, 740);
		f.setResizable(false);
		f.setTitle("Battle Tanks!");
		f.setLocation(0, 0);
		f.setVisible(true);
	}
}
