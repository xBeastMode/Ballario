package org.ballario;
import java.awt.Color;

import org.ballario.Entity.Cell;
import org.ballario.Manager.EntityManager;
import org.ballario.Map.Grid;
import org.ballario.Window.Window;
public class Ballario implements Runnable {
	
	public enum STATE{
		MAIN_MENU,
		GAME_PROCESS
	};
	
	public static EntityManager EM = new EntityManager();
	
	public static STATE game_state = STATE.MAIN_MENU;
	
	public static Window main = new Window();
		
	public static EntityManager EntityManager(){
		return EM;
	}
	
	public void render(){
		//TODO
	}
	
	public void tick(){
		//TODO
	}

	@Override
	public void run() {
		if(game_state == STATE.GAME_PROCESS){
			render();
			tick();
		}
	}
	
	public static void main(String[] args) {
		main.start();
		Thread t = new Thread(new Ballario());
		t.start();
	}
}