package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import event.Event_MouseListener03.MyMouseListener;

public class Event_MouseDoubleClick extends JFrame{
	JPanel contentPane = new JPanel();
	
	Event_MouseDoubleClick(){
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					int r = (int)(Math.random()*256);
					int g = (int)(Math.random()*256);
					int b = (int)(Math.random()*256);
					
					JPanel p = (JPanel)e.getSource();
					p.setBackground(new Color(r,g,b));
					
				}
			}
			
		});
		setSize(300,200);
		setVisible(true);
	}

	public static void main (String[] args) {
		new Event_MouseDoubleClick();
	}
}
