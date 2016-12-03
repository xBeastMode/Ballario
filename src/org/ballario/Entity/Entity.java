package org.ballario.Entity;

import org.ballario.Map.*;

import java.awt.Graphics;
import java.util.*;

public class Entity extends Vector2{
	
	public static int DATA_FLAG_FROZEN = 1;
	public static int DATA_FLAG_INVISIBLE = 2;
	
	public Map<Integer, Boolean> data_flags = new HashMap<Integer, Boolean>();
	
	public Entity(int x, int y){
		super(x, y);
	}
	
	public void hasCollided(){
		//check if collided with something else
	}
	
	public void updateMovement(){
		//update movement
	}
	
	public void render(Graphics g){
		//render entity graphics
	}
}
