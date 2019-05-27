package swingComponant;

import javax.swing.*;
import java.awt.*;
import java.awt.Event;

public class LabelImage extends JFrame{
	Container contentPane;
	LabelImage(){
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon beauty = new ImageIcon("images/beach.jpg");
		JLabel imageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("images/button.png");
		JLabel label = new JLabel("보고 싶으면 전화하세요.",normalIcon,SwingConstants.CENTER);
		
		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(label);
		
		setSize(400,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new LabelImage();
	}

}
