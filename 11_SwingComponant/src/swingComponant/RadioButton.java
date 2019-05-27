package swingComponant;

import javax.swing.*;
import java.awt.*;

public class RadioButton extends JFrame{
Container contentPane;
	
	RadioButton(){
		setTitle("Radio Button을 이용한 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
		ImageIcon selectedIcon = new ImageIcon("images/selectedCherry.png");
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배",true);
		JRadioButton cherry = new JRadioButton("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedIcon);
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setLocation(1000,200);
		setSize(250,150);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new RadioButton();
	}
	

}
