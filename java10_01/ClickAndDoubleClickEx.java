package java10_01;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame {
public ClickAndDoubleClickEx() {
	setTitle("Click and DoubleClick 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.addMouseListener(new MyMouseListener());//컨텐트팬에 mouse 소스 넣기
	setSize(300,200);
	setVisible(true);
}
class MyMouseListener extends MouseAdapter {//MouseListner ,MouseMotionListener를 합침
public void mouseClicked(MouseEvent e) {
if(e.getClickCount() == 2) {//클릭 두번시 이벤트 처리 부분
int r = (int)(Math.random()*256);//0~256가지 color
int g = (int)(Math.random()*256);
int b = (int)(Math.random()*256);
Component c = (Component)e.getSource(); 
c.setBackground(new Color(r,b,g)); 
}
}
}
public static void main(String [] args) {
new ClickAndDoubleClickEx();
}

}
