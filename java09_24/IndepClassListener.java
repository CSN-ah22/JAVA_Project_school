package java09_24;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("202030430 최선아");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println(e);
			JButton b = (JButton)e.getSource();
			System.out.println(b.getText());
			if(b.getText().equals("Action"))
			b.setText("액션");
			else
				b.setText("Action");
		}
	}
}
