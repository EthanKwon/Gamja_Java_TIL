package event;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Event_MouseListener02 extends JFrame implements MouseListener{
	JLabel la;
	
	Event_MouseListener02(){
		setTitle("Mouse Action 이벤트");
		setLayout(null);
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane.addMouseListener(this);
		
		la = new JLabel("hello");
		la.setSize(50,20);
		la.setLocation(30,30);
		contentPane.add(la);

		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Event_MouseListener02();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/*int x = e.getX();
		int y = e.getY();
		la.setLocation(x,y);*/
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		la.setLocation(x,y);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
