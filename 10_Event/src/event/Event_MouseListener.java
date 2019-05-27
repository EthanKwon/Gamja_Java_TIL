package event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Event_MouseListener extends JFrame implements MouseListener {
	public Event_MouseListener() {
		setTitle("Mouse Action 이벤트");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Mouse Event");
		btn.addMouseListener(this);
		add(btn);
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Event_MouseListener();
	}

	@Override //마우스를 클릭 했을 때
	public void mouseClicked(MouseEvent arg0) {
		JButton btn = (JButton)arg0.getSource();
		btn.setBackground(Color.BLUE);
		
	}

	@Override //마우스를 올려 놓았을 때
	public void mouseEntered(MouseEvent arg0) {
		JButton btn = (JButton)arg0.getSource();
		btn.setBackground(Color.CYAN);
		
	}

	@Override // 마우스를 영역에서 벗어낫을 때
	public void mouseExited(MouseEvent arg0) {
		JButton btn = (JButton)arg0.getSource();
		btn.setBackground(Color.YELLOW);
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
