package org.ballario.Entity;

import org.ballario.Ballario;
import org.ballario.Map.*;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.*;

public class Entity extends Vector2{
	
	public static final int DATA_FLAG_FROZEN = 1;
	public static final int DATA_FLAG_INVISIBLE = 2;
	
	public Map<Integer, Boolean> data_flags = new HashMap<Integer, Boolean>();
	
	public Entity(int x, int y){
		super((x <= 0 ? (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() /2 : x),
				(y <= 0 ? (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() /2 : y));
		this.data_flags.put(DATA_FLAG_FROZEN, false);
		this.data_flags.put(DATA_FLAG_INVISIBLE, false);
	}
	
	public void setDataFlag(int DATA_FLAG, Boolean value){
		switch(DATA_FLAG){
		case DATA_FLAG_FROZEN:
			this.data_flags.put(DATA_FLAG_FROZEN, value);
		break;
		case DATA_FLAG_INVISIBLE:
			this.data_flags.put(DATA_FLAG_INVISIBLE, value);
		break;
		}
	}
	
	public void die(){
		Ballario.EntityManager().removeEntity(this);
	}
	
	public Object[] getCollision(){
		Object[] collision = {};
		for(Object ent : Ballario.EntityManager().getAllEntities()){
			if(ent instanceof Cell || ent instanceof Virus){
				Vector2 v = ((Cell) ent).subtract(this);
				if(v.x <= 10 && v.y <= 10){
					collision[System.identityHashCode(ent)] = ent;
				}
			}
		}
		return collision;
	}
	
	public void updateMovement(){
		//update movement
	}
	
	public void render(Graphics g){
		//render entity graphics
	}
}
