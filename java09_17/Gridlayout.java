package java09_17;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gridlayout extends JFrame {
public Gridlayout() {
setTitle("202030430-�ּ���");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //xâ ������ Ȱ��ȭ

Container c = getContentPane();
c.setLayout(new GridLayout(1,10,1,1)); 
c.add(new JButton("0")); // ��� ���� ù ��° ���� ��ư ��ġ
c.add(new JButton("1")); // ��� ���� ù ��° ���� ��ư ��ġ
c.add(new JButton("2")); // �� �� ���� ��ư ��ġ
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

