package org.ballario.Map;
import java.awt.*;
public class Grid{
	public void render(Graphics g){
		for(int i = 0; i <= 6400; i += 50){
			for(int j = 0; j <= 3600; j += 50){
				g.setColor(Color.LIGHT_GRAY);
				g.drawLine(0, j, i, j);
				g.drawLine(i, 0, i, j);
			}
		}
	}
}
