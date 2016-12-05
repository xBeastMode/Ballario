package org.ballario.Entity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Virus extends Entity{

	public int mass;
	public Color color;
	public String name;
	
	public Virus(int x, int y, int mass) {
		super(x, y);
		this.name = "Virus";
		this.mass = mass;
		this.color = new Color(0, 255, 0);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void addMass(int mass){
		this.mass += mass;
	}
	
	public void subtractMass(int mass){
		this.mass -= mass;
	}
	
	public void divideMass(int mass){
		this.mass = ((int)this.mass / mass);
	}
	
	public void multiplyMass(int mass){
		this.mass *= mass;
	}
	
	public void setMass(int mass){
		this.mass = mass;
	}
	
	public int getMass(){
		return this.mass;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public void updateMovement(){
		//not required
	}
	
	public void render(Graphics g){
		g.setColor(this.getColor().darker());
		int radius = 12;
		g.fillOval(
				(this.getX() - this.getMass()) - ((int) radius / 2), 
				(this.getY() - this.getMass()) - ((int) radius / 2), 
				(this.getMass()*2) + radius, (this.getMass()*2-1) + radius);//outline
		g.setColor(this.color);
		g.fillOval(
				this.getX() - this.getMass(),
				this.getY() - this.getMass(),
				this.getMass()*2, this.getMass()*2);//virus itself
		g.setColor(Color.GRAY);
		g.setFont(new Font("Arial", Font.ITALIC, (this.getMass() / 2) + 5));
	}
	
}