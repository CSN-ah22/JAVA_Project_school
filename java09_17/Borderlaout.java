package java09_17;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Borderlaout extends JFrame {
	
	public Borderlaout() {
		setTitle("202030430-�ּ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("west"), BorderLayout.WEST);
		setSize(300, 200); // ������ ũ�� 300��200 ����
		setVisible(true); // �������� ȭ�鿡 ���
	}
	
	public static void main(String[] args){
		new Borderlaout();

	}
}
