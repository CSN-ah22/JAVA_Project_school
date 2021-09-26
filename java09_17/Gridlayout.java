package java09_17;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gridlayout extends JFrame {
public Gridlayout() {
setTitle("202030430-최선아");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x창 누르기 활성화

Container c = getContentPane();
c.setLayout(new GridLayout(1,10,1,1)); 
c.add(new JButton("0")); // 상단 왼쪽 첫 번째 셀에 버튼 배치
c.add(new JButton("1")); // 상단 왼쪽 첫 번째 셀에 버튼 배치
c.add(new JButton("2")); // 그 옆 셀에 버튼 배치
c.add(new JButton("3"));
c.add(new JButton("4"));
c.add(new JButton("5"));
c.add(new JButton("6"));
c.add(new JButton("7"));
c.add(new JButton("8"));
c.add(new JButton("9"));
setSize(550, 200);
setVisible(true);
}
public static void main(String[] args) {
new Gridlayout();
}
}

