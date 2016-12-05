package org.ballario.Manager;
import java.util.HashMap;
import java.util.Map;
public class EntityManager{
	
	public Map<Integer, Object> Entities = new HashMap<Integer, Object>();
	
	public void addEntity(Object ent){
		this.Entities.put(System.identityHashCode(ent), ent);
	}
	
	public Boolean entityExists(Object ent){
		return this.Entities.containsValue(System.identityHashCode(ent));
	}
	
	public Object[] getAllEntities(){
		Object[] entities = {};
		for(java.util.Map.Entry<Integer, Object> entry : this.Entities.entrySet()){
			entities[entry.getKey()] = entry.getValue();
		}
		return entities;
	}
	
	public void removeEntity(Object ent){
		if(this.entityExists(ent)){
			this.Entities.remove(System.identityHashCode(ent));
		}
	}
}
