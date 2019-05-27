package swingComponant;

import javax.swing.*;
import java.awt.*;

public class Slider_Basic extends JFrame {
	Container contentPane;
	Slider_Basic(){
		setTitle("슬라이더 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		contentPane.add(slider);
		setSize(300,100);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new Slider_Basic();
	}

}
