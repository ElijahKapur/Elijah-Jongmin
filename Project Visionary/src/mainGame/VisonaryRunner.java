

package mainGame;

import java.awt.Graphics2D;

import entites.Player;
import utilites.GDV5;

public class VisonaryRunner extends utilites.GDV5{

	public static int windowSizeX = 800;
	private static int windowSizeY = 600;
	
	private static VisonaryRunner b = new VisonaryRunner();
	
	private Map gameMap = new Map();
	private Player player = new Player();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GDV5.setMaxWindowX(windowSizeX);
		GDV5.setMaxWindowY(windowSizeY);
		b.setTitle("Visionary");
		b.start();
		
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		player.move();
	}

	@Override
	public void draw(Graphics2D win) {
		// TODO Auto-generated method stub
		drawMap(win);
		win.drawImage(player.dot,player.getScreenX(),player.getScreenY(),Tile.getTileSize(),Tile.getTileSize(),null);
		
		
	}
	
	public void drawMap(Graphics2D win) {
		Tile[] map = Map.getMap();
		for(Tile b:map) {
			 int worldX = b.getWorldX();
			 int worldY = b.getWorldY();
			 
			 int RealX = worldX-player.getWorldX()+VisonaryRunner.getWindowSizeX()/2;
			 int RealY = worldY-player.getWorldY()+VisonaryRunner.getWindowSizeY()/2;
			win.drawImage(b.getImage(),RealX,RealY,Tile.getTileSize(),Tile.getTileSize(),null);
		}
	}
	
	public static int getWindowSizeY() {
		// TODO Auto-generated method stub
		return windowSizeY;
	}
	public static int getWindowSizeX() {
		// TODO Auto-generated method stub
		return windowSizeX;
	}


}
