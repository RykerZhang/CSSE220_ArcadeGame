import java.awt.*;


import javax.swing.JComponent;


public class platform{
	private int x;
	private int y;
	private int width;
	private int height;
	
	public platform(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
//	class platformComponent extends JComponent{
//		@Override
//		protected void paintComponent(Graphics g) {
//			// TODO Auto-generated method stub
//			super.paintComponent(g);
//			Graphics2D g2=(Graphics2D)g;
//		}
//	}
	
	public void drawOn(Graphics g2) {
		g2.setColor(Color.BLACK);
		g2.fillRect(x, y, width, height);
	}
}
