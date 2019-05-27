package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Event_MouseListener03 extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	
	Event_MouseListener03(){
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.addMouseListener(
				new MyMouseListener());
		contentPane.addMouseMotionListener(
				new MyMouseListener());
		la = new JLabel("No Mouse Event");
		contentPane.add(la);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Event_MouseListener03();
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent arg0) {
			la.setText("MouseDragged (" + arg0.getX()+","+arg0.getY()+")");
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			la.setText("MouseMoved (" + arg0.getX()+","+arg0.getY()+")");
			
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			JPanel p = (JPanel)arg0.getSource();
			p.setBackground(Color.CYAN);
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			JPanel p = (JPanel)arg0.getSource();
			p.setBackground(Color.YELLOW);
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			la.setText("MousePressed (" + arg0.getX()+","+arg0.getY()+")");
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			la.setText("MouseReleased (" + arg0.getX()+","+arg0.getY()+")");
		}
	
	}
	

}
