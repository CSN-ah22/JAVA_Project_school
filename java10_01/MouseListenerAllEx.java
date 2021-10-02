package java10_01;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java10_01.ClickAndDoubleClickEx.MyMouseListener;
import java10_01.FlyingTextEx.MyKeyListener;

public class MouseListenerAllEx extends JFrame {
private JLabel la = new JLabel("No Mouse Event");
public MouseListenerAllEx() {
setTitle("최선아");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c = getContentPane();
c.add(la);
c.setLayout(new FlowLayout());
MyMouseAdapter listener = new MyMouseAdapter();
c.addMouseListener(new MyMouseAdapter());
c.addMouseMotionListener(new MyMouseAdapter());
c.add(la);
setSize(300,200);
setVisible(true);
}
class MyMouseAdapter extends MouseAdapter {
public void mousePressed(MouseEvent e) {//마우스 위치
	Component c = (Component)e.getSource();
la.setText("mousePressed ("+e.getX()+", "+e.getY()+")");
}
public void mouseReleased(MouseEvent e) {//마우스 떼었을때
	Component c = (Component)e.getSource();
la.setText("MouseReleased("+e.getX()+", "+e.getY()+")");

}
public void mouseClicked(MouseEvent e) {
	//마우스 클릭했을때
}
public void mouseEntered(MouseEvent e) {//왼쪽 클릭, 오른쪽 클릭
Component c = (Component)e.getSource();
c.setBackground(Color.CYAN);
}
public void mouseExited(MouseEvent e) {
Component c = (Component)e.getSource();
c.setBackground(Color.YELLOW);
}
public void mouseDragged(MouseEvent e) {
la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
}
public void mouseMoved(MouseEvent e) {
la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
}
 
}
public static void main(String [] args) {
new MouseListenerAllEx();
}
}

