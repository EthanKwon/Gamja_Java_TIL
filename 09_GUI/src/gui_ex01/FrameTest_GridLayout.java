package gui_ex01;

import javax.swing.*;
import java.awt.*;

public class FrameTest_GridLayout extends JFrame {
	FrameTest_GridLayout(){
		setTitle("GridLayout 설정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		contentPane.setLayout(grid); // Layout을 grid로 설정
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField(""));
		
		setSize(350, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameTest_GridLayout();
	}

}
