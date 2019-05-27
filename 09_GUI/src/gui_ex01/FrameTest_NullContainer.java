package gui_ex01;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest_NullContainer extends JFrame{
	FrameTest_NullContainer(){
		setTitle("Null Container 설정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null); //Layout을 Null로 설정한다.
		
		JLabel la = new JLabel("Hello,Press Buttons!");
		
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		for(int i=1;i<18;i++) {
			JButton b = new JButton(Integer.toString(i));
			if(i>9) {
				b.setLocation(i*15, (18-i)*15);
				b.setSize(50,20);
			} else {
				b.setLocation(i*15, i*15);
				b.setSize(50,20);
			}
			c.add(b);
		}
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameTest_NullContainer();
	}

}
