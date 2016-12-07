package org.ballario.Entity;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Color;
import java.awt.Font;

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
	
	public void tick(Graphics g){
		this.render(g);
		this.updateMovement();
	}
	
	public void updateMovement(){
		
	}
	
	public void render(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
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
				this.getMass()*2, this.getMass()*2);//ball itself
		g.setColor(Color.GRAY);
		g.setFont(new Font("Arial", Font.BOLD, (this.getMass() / 2) + 5));
		if(this.getName() != "An unnamed cell"){
			g.drawString(this.getName(),
					this.getX() - (this.getMass() + 25),
					this.getY() - (this.getMass() - 22));
		}
		g2d.translate(this.getX(), this.getY());
	}
	
}