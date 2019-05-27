package event;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Event_Basic extends JFrame implements ActionListener {
	public Event_Basic() {
		setTitle("Action 이벤트");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		btn.addActionListener(this);
		add(btn);
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Event_Basic();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}


}
