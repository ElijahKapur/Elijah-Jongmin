package entites;

import mainGame.Map;
import mainGame.Tile;
import mainGame.VisonaryRunner;
import utilites.GDV5;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Player {
	
	private int worldX;
	private int worldY;
	private int screenX;
	private int screenY;
	private int speed = 4;
	
	public static BufferedImage dot;

	
	
	public Player() {
		screenX = VisonaryRunner.getWindowSizeX()/2;
		screenY = VisonaryRunner.getWindowSizeY()/2;
		setLocation();
		
		try {
			dot = ImageIO.read(getClass().getResourceAsStream("/Images/dot.png"));
			}
		catch(IOException e) {
			e.printStackTrace();
		}

		
	}
	public void setLocation() {
		Tile Spawn = Map.getSpawn();
		worldY = Spawn.getWorldY();
		worldX = Spawn.getWorldX();
		
	}
	
	public void move() {
		if(GDV5.KeysPressed[KeyEvent.VK_D]) {
			worldX+=speed; 
		}
		if(GDV5.KeysPressed[KeyEvent.VK_A]) {
			worldX-=speed; 
		}
		if(GDV5.KeysPressed[KeyEvent.VK_W]) {
			worldY-=speed; 
		}
		if(GDV5.KeysPressed[KeyEvent.VK_S]) {
			worldY+=speed; 
		}
		//System.out.println("WorldY"+worldY);
		//System.out.println("WorldX"+worldX);
		
	}

	public int getScreenY() {
		// TODO Auto-generated method stub
		return screenY;
	}

	public int getScreenX() {
		// TODO Auto-generated method stub
		return screenX;
	}

	public int getWorldX() {
		// TODO Auto-generated method stub
		return worldX;
	}
	public int getWorldY() {
		// TODO Auto-generated method stub
		return worldY;
	}
	public void setWorldX(int newVal) {
		// TODO Auto-generated method stub
		this.worldX = newVal;
	}
	public void setWorldY(int newVal) {
		// TODO Auto-generated method stub
		this.worldY = newVal;
	}
}
