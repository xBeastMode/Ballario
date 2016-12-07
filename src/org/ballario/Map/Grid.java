package org.ballario.Map;
import java.awt.*;
public class Grid{
	public int width;
	public int height;
	public Grid(int width, int height){
		this.width = width;
		this.height = height;
	}
	public void render(Graphics g){
		for(int i = 0; i <= this.width; i += 50){
			for(int j = 0; j <= this.height; j += 50){
				g.setColor(Color.LIGHT_GRAY);
				g.drawLine(0, j, i, j);
				g.drawLine(i, 0, i, j);
			}
		}
	}
}
