package org.ballario.Map;
import org.ballario.Utils.*;
public class Vector2{
	public int x, y;
	
	public Vector2(int x, int y){
		this.x = x;
		this.y = y;
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
	
	public Vector2 distance(Vector2 v){
		Evaluator eval = new Evaluator(this.x, this.y, v.x, v.y);
		int x = eval.getMax(0, 2) - eval.getMin(0, 2);
		int y = eval.getMax(1, 3) - eval.getMax(1, 3);
		Vector2 vec = new Vector2(x, y);
		return vec;
	}
	
	public Vector2 add(int m1, int m2){
		this.x += m1;
		this.y += m2;
		return this;
	}
	
	public Vector2 add(Vector2 v){
		this.x += v.x;
		this.y += v.x;
		return this;
	}
	
	public Vector2 subtract(int m1, int m2){
		this.x -= m1;
		this.y -= m2;
		return this;
	}
	
	public Vector2 subtract(Vector2 v){
		this.x -= v.x;
		this.y -= v.x;
		return this;
	}
	
	public Vector2 divide(int m1, int m2){
		this.x /= m1;
		this.y /= m2;
		return this;
	}
	
	public Vector2 divide(Vector2 v){
		this.x /= v.x;
		this.y /= v.x;
		return this;
	}
	
	public Vector2 multiply(int m1, int m2){
		this.x *= m1;
		this.y *= m2;
		return this;
	}
	
	public Vector2 multiply(Vector2 v){
		this.x *= v.x;
		this.y *= v.x;
		return this;
	}
}
