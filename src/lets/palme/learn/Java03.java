package lets.palme.learn;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java03 {
	
	public static void main(String[] args){
		JFrame frame = new JFrame("gggg");
		frame.add(new myComponent3("gggffff"));
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class myComponent3 extends JComponent implements MouseMotionListener,ActionListener{
	String st;
	JButton Jbutton;
	int colorIndex;
	static Color[] color ={Color.black,Color.gray,Color.red};
	int x= 150, y = 125;
	public myComponent3(String st){
		this.st = st;
		Jbutton = new JButton("ChangeColor");
		setLayout(new FlowLayout());
		add(Jbutton);
		Jbutton.addActionListener(this);
		addMouseMotionListener(this);
	}
	public void paintComponent(Graphics g){
		g.drawString(st, x, y);
	}
	public void mouseDragged(MouseEvent e){
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent e){
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== Jbutton){
			changeColor();
		}
	}
	synchronized private void changeColor(){
		if(++colorIndex==color.length){
			colorIndex = 0;			
		}
		setForeground(currentColor());
		repaint();
	}
	synchronized private Color currentColor(){
		return color[colorIndex];
	}
	
}