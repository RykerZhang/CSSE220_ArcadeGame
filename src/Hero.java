import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;

public class Hero extends JComponent implements KeyListener{
	private int x;
	private int y;
	private int length;
	private int height;
	private int moveSpeed = 10;
	private int jumpSpeed = 10;
	private Color color;
	
	public Hero(int x, int y, int length, int height) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.height = height;
		this.color = Color.BLUE;
	}
	
	public void paint(Graphics g) {
		g.translate(x, y);
		g.setColor(this.color);
		g.fillOval(- length/2, - height/2, length, height);
		g.translate(-x, -y);
	}
 

	@Override
	public void keyTyped(KeyEvent e) {	
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(this.x<-moveSpeed+length/2){
			this.x = -moveSpeed+length/2;
		}
		if(this.x>=1200-length+2*moveSpeed){
			this.x = 1200-length+2*moveSpeed;
		}
		if(this.y<this.height+jumpSpeed){
			this.y = this.height-2*jumpSpeed;
		}
			if (e.getKeyCode() == KeyEvent.VK_UP&&this.y!=this.height-2*jumpSpeed) {
				y -= jumpSpeed;
			}
			if ((e.getKeyCode() == KeyEvent.VK_LEFT&&this.x>=this.length/2)||this.x==1200-length+2*moveSpeed) {
				x -= moveSpeed;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT||this.x==-moveSpeed+length/2) {
				x += moveSpeed;
			}
			this.repaint();

	}
	
	@Override
	public void keyReleased(KeyEvent e) {		
	}
}
