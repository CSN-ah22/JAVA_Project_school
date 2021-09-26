package java09_17;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Borderlaout extends JFrame {
	
	public Borderlaout() {
		setTitle("202030430-최선아");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("west"), BorderLayout.WEST);
		setSize(300, 200); // 프레임 크기 300×200 설정
		setVisible(true); // 프레임을 화면에 출력
	}
	
	public static void main(String[] args){
		new Borderlaout();

	}
}
