package gui_ex01;

import javax.swing.*;
import java.awt.*;

//1. 컴포넌트를 부착한 프레임 예
public class FrameTest_Component extends JFrame{
	FrameTest_Component() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40)); // FlowLayout 사용(LEFT 정렬, 가로간격 30, 세로간격 40)
		contentPane.add(new JButton("left"));
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("right"));
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameTest_Component();
	}

}
