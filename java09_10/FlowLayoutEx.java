package java09_10;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame {
public FlowLayoutEx() {
	setTitle("202030430 √÷º±æ∆");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	
	c.setLayout(new FlowLayout(FlowLayout.RIGHT, 50,50));
	c.add(new JButton("add"));
	c.add(new JButton("sub"));
	c.add(new JButton("mul"));
	c.add(new JButton("div"));
	c.add(new JButton("Calculate"));
	
	setSize(500,500);
	setVisible(true);
}

public static void main(String[] args) {
	new FlowLayoutEx();
}
}
