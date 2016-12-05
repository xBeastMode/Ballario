package org.ballario.Map;
import java.awt.*;
public class Grid{
	public void render(Graphics g){
		Dimension D = Toolkit.getDefaultToolkit().getScreenSize();
		for(int i = 0; i <= D.getWidth() + 10; i += 50){
			for(int j = 0; j <= D.getWidth() + 10; j += 50){
				g.setColor(Color.LIGHT_GRAY);
				g.drawLine(0, j, i, j);
				g.drawLine(i, 0, i, j);
			}
		}
	}
}
