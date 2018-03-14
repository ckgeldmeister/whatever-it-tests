package lets.palme.learn;

import java.awt.*;
import java.awt.Event;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

class Java02{
//	public static void main(String[] args){
//		JFrame frame = new JFrame("xx");
//		frame.add(new MyComponent2("ddd"));
//		frame.setVisible(true);
//		frame.setSize(300, 300);
//	}
}
class MyComponent2 extends JComponent implements MouseMotionListener{
	String text;
	int x = 125, y = 95;
	public MyComponent2(String textArg) {
		this.text = textArg;
		addMouseMotionListener(this);
	}
	public void paintComponent(Graphics g){
		g.drawString(text, x, y);
		
	}
	public void mouseMoved(MouseEvent e){
		
	}
	public void mouseDragged(MouseEvent e){
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
}