package org.ballario.Utils;
import java.util.ArrayList;
public class Evaluator {
	
	public ArrayList<Integer> evaluations = new ArrayList<Integer>();
	
	public Evaluator(int ...args){
		for(int arg : args){
			this.evaluations.add(arg);
		}
	}
	
	public int getMin(int place1, int place2){
		if(this.evaluations.get(place1) < this.evaluations.get(place2)){
			return this.evaluations.get(place1);
		}else{
			return this.evaluations.get(place2);
		}
	}
	
	public int getMax(int place1, int place2){
		if(this.evaluations.get(place1) > this.evaluations.get(place2)){
			return this.evaluations.get(place1);
		}else{
			return this.evaluations.get(place2);
		}
	}
}
