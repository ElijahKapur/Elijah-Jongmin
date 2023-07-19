

package mainGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import entites.Player;
import utilites.GDV5;

public class VisonaryRunner extends utilites.GDV5{

	public static int windowSizeX = 800;
	private static int windowSizeY = 600;
	
	private static VisonaryRunner b = new VisonaryRunner();
	
	private static Map gameMap = new Map();
	private static Player player = new Player();
	
	private String gameScreen = "title";
	
	private boolean loading = true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GDV5.setMaxWindowX(windowSizeX);
		GDV5.setMaxWindowY(windowSizeY);
		b.setTitle("Visionary");
		b.start();
		gameMap.loadMap();
		b.setPlayable();
		player.setLocation();
		
		
	}
	private void setPlayable() {
		// TODO Auto-generated method stub
		this.loading = false;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		player.move();
	}

	@Override
	public void draw(Graphics2D win) {
		// TODO Auto-generated method stub
		win.setColor(Color.WHITE);
		Font c= new Font( "Serif", Font.PLAIN,30);
		Font header= new Font( "SansSerif", Font.PLAIN,30);
		Font title = new Font( "SansSerif", Font.PLAIN,60);
		Font normalText = new Font( "SansSerif", Font.PLAIN,20);
		if(!loading) {
			changeScreen();
		}
		if(gameScreen.equals("game")) {
			this.drawMap(win);
			win.drawImage(player.dot,player.getScreenX(),player.getScreenY(),Tile.getTileSize(),Tile.getTileSize(),null);
		}
		if(gameScreen.equals("title")) {
			win.setColor(Color.WHITE);
			drawText("Adventure:Visionary",title,100,200,win);
			drawText("Made by Elijah Kapur",normalText,250,230,win);
			if(loading) {
				drawText("Loading...",title,250,350,win);
			}
			else {
				win.setColor(Color.CYAN);
				drawText("Press [G] to play",header,150,300,win);
				drawText("Press [C] to see key layout",header,150,350,win);
				drawText("Press [H] for how to play",header,150,400,win);
				drawText("Press [L] to change level difficulty",header,150,450,win);
			}

		}
		
		
	}
	
	public void drawMap(Graphics2D win) {
		Tile[][] map = Map.getMap();
		for(Tile[] b:map) {
			 for(Tile t:b) {
				 int worldX = t.getWorldX();
				 int worldY = t.getWorldY();
				 
				 int RealX = worldX-player.getWorldX()+VisonaryRunner.getWindowSizeX()/2;
				 int RealY = worldY-player.getWorldY()+VisonaryRunner.getWindowSizeY()/2;
				win.drawImage(t.getImage(),RealX,RealY,Tile.getTileSize(),Tile.getTileSize(),null);
			 }
		}
	}
	public void drawText(String str,Font font,int LocX,int LocY,Graphics2D win) {
		win.setFont(font);
		win.drawString(str,LocX,LocY);
	}
	public void changeScreen() {
		if(GDV5.KeysPressed[KeyEvent.VK_T]) {
			gameScreen = "title";
		}
		if(GDV5.KeysPressed[KeyEvent.VK_G]) {
			gameScreen = "game";
		}
		if(GDV5.KeysPressed[KeyEvent.VK_W]) {
		}
		if(GDV5.KeysPressed[KeyEvent.VK_S]) {
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
