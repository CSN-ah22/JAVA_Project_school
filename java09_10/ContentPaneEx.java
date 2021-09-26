package java09_10;
import java.awt.*;
import javax.swing.*;


public class ContentPaneEx extends JFrame {
public ContentPaneEx() {
	setTitle("202030430 √÷º±æ∆");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container contentPane = getContentPane();
	contentPane.setBackground(Color.orange);
	contentPane.setLayout(new FlowLayout());
	
	contentPane.add(new JButton("OK"));
	contentPane.add(new JButton("Cancel"));
	contentPane.add(new JButton("Igonre"));
	
	setSize(300,150);
	setVisible(true);
}

public static void main(String[] args) {
	new ContentPaneEx();
}
}

