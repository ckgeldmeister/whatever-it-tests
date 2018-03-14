package lets.palme.learn;

import javax.swing.*;
import java.awt.*;

class Java01{
//	public static void main(String[] args){
//		JFrame frame = new JFrame("nothing to declair");
//		frame.add(new myComponent1());
//		frame.setSize(300,300);
//		frame.setVisible(true);
//	}	
}
class myComponent1 extends JComponent{
	public void paintComponent(Graphics g){
		g.drawString("5", 125, 95);
	}
}