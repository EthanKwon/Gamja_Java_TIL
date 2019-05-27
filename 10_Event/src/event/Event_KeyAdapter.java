package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Event_KeyAdapter extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO");
	final int FLYING_UNIT = 10;
	
	Event_KeyAdapter(){
		setTitle("상 하 좌 우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(),la.getY()-FLYING_UNIT);
					break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(),la.getY()+FLYING_UNIT);
					break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX()-FLYING_UNIT,la.getY());
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+FLYING_UNIT,la.getY());
					break;
				
				}
			}
			
		});
		la.setLocation(50,50);
		la.setSize(100,20);
		contentPane.add(la);
		setSize(300,300);
		setVisible(true);
		contentPane.requestFocus();
	}
	
	public static void main(String[] args) {
		new Event_KeyAdapter();
	}

}
