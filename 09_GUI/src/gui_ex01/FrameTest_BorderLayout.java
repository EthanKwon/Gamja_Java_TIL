package gui_ex01;

import javax.swing.*;
import java.awt.*;


//2. BorderLayout 사용 예
public class FrameTest_BorderLayout extends JFrame {
	
	FrameTest_BorderLayout() {
		setTitle("BorderLayout 설정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new BorderLayout()); // Layout을 BorderLayout로 설정
		contentPane.add(new JButton("NORTH"),BorderLayout.NORTH);
		contentPane.add(new JButton("SOUTH"),BorderLayout.SOUTH);
		contentPane.add(new JButton("EAST"),BorderLayout.EAST);
		contentPane.add(new JButton("WEST"),BorderLayout.WEST);
		contentPane.add(new JButton("CENTER"),BorderLayout.CENTER);
		
		setSize(350, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameTest_BorderLayout();
	}

}