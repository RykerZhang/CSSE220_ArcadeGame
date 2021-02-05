import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.logging.Level;

import javax.swing.JComponent;

public class platformComponent extends JComponent{

	private ArrayList<platform>platformList;

	
	@Override
protected void paintComponent(Graphics g) {
	// TODO Auto-generated method stub
	super.paintComponent(g);
	Graphics2D g2=(Graphics2D) g;
	LevelFile levelFile = new LevelFile();
	platformList = levelFile.getPlatform();


	for(int i=0;i<platformList.size();i++) {
		platformList.get(i).drawOn(g2);
	}
}
}
