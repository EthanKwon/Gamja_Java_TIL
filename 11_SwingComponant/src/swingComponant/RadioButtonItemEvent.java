package swingComponant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonItemEvent extends JFrame {
	Container contentPane;
	JRadioButton [] radio = new JRadioButton [3];
	String [] text = {"사과","배","체리"};
	ImageIcon [] image = {
		new ImageIcon("Images/apple.jpg"),
		new ImageIcon("Images/pear.jpg"),
		new ImageIcon("Images/cherry.png")};
	JLabel imageLabel = new JLabel();
	
	RadioButtonItemEvent(){
		setTitle("라디오버튼 Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0;i<radio.length;i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			panel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);
		contentPane.add(panel,BorderLayout.NORTH);
		contentPane.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setLocation(1000,200);
		setSize(250,200);
		setVisible(true);	
	}
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.DESELECTED) return;
			if(radio[0].isSelected()) 
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected()) 
				imageLabel.setIcon(image[1]);
			else 
				imageLabel.setIcon(image[2]);
		}
	}
	public static void main(String[] args){
		new RadioButtonItemEvent();
	}
}