package swingComponant;

import javax.swing.*;
import java.awt.*;

public class CheckBoxFruit extends JFrame {
	Container contentPane;
	
	CheckBoxFruit(){
		setTitle("CheckBox를 이용한 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
		ImageIcon selectedIcon = new ImageIcon("images/selectedCherry.png");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배",true);
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedIcon);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setSize(400,600);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new CheckBoxFruit();
	}
	

}
