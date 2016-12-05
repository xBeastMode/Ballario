package org.ballario;
import org.ballario.Manager.EntityManager;
import org.ballario.Window.Window;
public class Ballario implements Runnable {
	
	public enum STATE{
		MAIN_MENU,
		GAME_PROCESS
	};
	
	public static final EntityManager EM = new EntityManager();
	
	public STATE game_state = STATE.MAIN_MENU;
		
	public static final EntityManager EntityManager(){
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
		Window main = new Window();
		main.start();
	}
}