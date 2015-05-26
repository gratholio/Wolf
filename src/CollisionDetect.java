import java.util.ArrayList;

import JavaCastleWolfenstein.Player;
import JavaCastleWolfenstein.Object;



public class CollisionDetect {
	private Player player;
	private ArrayList<Object> objectList;
	
	public CollisionDetect(Player inPlayer, ArrayList<Object> inObjectList){
		this.player = inPlayer;
		this.objectList = inObjectList;
		
	}
	
	public void detect(){
		for (int i = 0; i < objectList.size(); i++){
			if (objectList.get(i).getCollisionRect().intersects(player.getCollisionRect())){
				System.out.println("_____| Collision Detected from Within CollisionDetect Class");
			}
		}
	}
	
	public void update(Player inPlayer){
		this.player = inPlayer;
	}
}
