package java09_17;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gridlayout_Color extends JFrame {
		public Gridlayout_Color() {
		setTitle("202030430-�ּ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //xâ ������ Ȱ��ȭ

		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10,0,0)); 
		c.add(new JButton("0")).setBackground(Color.red); // ��� ���� ù ��° ���� ��ư ��ġ
		c.add(new JButton("1")).setBackground(Color.orange); // ��� ���� ù ��° ���� ��ư ��ġ
		c.add(new JButton("2")).setBackground(Color.yellow); // �� �� ���� ��ư ��ġ
		c.add(new JButton("3")).setBackground(Color.green);
		c.add(new JButton("4")).setBackground(Color.CYAN);
		c.add(new JButton("5")).setBackground(Color.blue);
		c.add(new JButton("6")).setBackground(Color.magenta);
		c.add(new JButton("7")).setBackground(Color.gray);
		c.add(new JButton("8")).setBackground(Color.pink);
		c.add(new JButton("9")).setBackground(Color.LIGHT_GRAY);
		setSize(550, 200);
		setVisible(true);
		}
		public static void main(String[] args) {
		new Gridlayout_Color();
		}
}
