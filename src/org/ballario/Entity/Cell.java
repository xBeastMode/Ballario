package org.ballario.Entity;

import java.awt.*;

public class Cell extends Entity{
	public String name;
	public int mass;
	public Color color;
	public Boolean isEjected = false;
	
	public Cell(String name, int mass, int x, int y, Boolean isEjected, Color color){
		super(x, y);
		this.name = name == null ? "An unnamed cell" : name;
		this.mass = mass;
		this.isEjected = isEjected;
		this.color = color;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setMass(int mass){
		this.mass = mass;
	}
	
	public int getMass(){
		return this.mass;
	}
	
	public Boolean isEjected(){
		return this.isEjected;
	}
	
	public void setEjected(Boolean val){
		this.isEjected = val;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public void updateMovement(){
		
	}
	
	public void render(Graphics g){
		g.setColor(this.getColor());
		g.fillOval(this.getX() - this.getMass(), this.getY() - this.getMass(), this.getMass()*2, this.getMass()*2);
	}
	
}