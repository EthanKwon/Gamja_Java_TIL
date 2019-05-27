package swingComponant;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ButtonImage extends JFrame {
	Container contentPane;
	ButtonImage(){
		setTitle("ButtonImage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
	
		JButton btn = new JButton("call ~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		
		
		contentPane.add(btn);
		
		setSize(400,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ButtonImage();
	}

}
