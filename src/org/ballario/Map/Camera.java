package org.ballario.Map;

import org.ballario.Entity.Entity;

public class Camera {
	public int x, y;
	public Camera(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void tick(Object ent){
		if(ent instanceof Entity){
			x = ((Entity) ent).x;
			y = ((Entity) ent).y;
		}
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return this.x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return this.y;
	}
}
