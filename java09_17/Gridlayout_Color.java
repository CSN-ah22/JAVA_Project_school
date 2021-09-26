package java09_17;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gridlayout_Color extends JFrame {
		public Gridlayout_Color() {
		setTitle("202030430-최선아");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x창 누르기 활성화

		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10,0,0)); 
		c.add(new JButton("0")).setBackground(Color.red); // 상단 왼쪽 첫 번째 셀에 버튼 배치
		c.add(new JButton("1")).setBackground(Color.orange); // 상단 왼쪽 첫 번째 셀에 버튼 배치
		c.add(new JButton("2")).setBackground(Color.yellow); // 그 옆 셀에 버튼 배치
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
