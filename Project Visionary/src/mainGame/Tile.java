package mainGame;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tile {
	
	private static int tileSize = 32;
	private Color tileColor;
	
	private int worldX;
	private int worldY;
	private int col;
	private int row;
	private int type;
	
	private BufferedImage tileImage;
	
	
	public Tile(int r, int c,int type) {
		tileColor= Color.CYAN ;
		this.col = c;
		this.row = r;
		worldX = col*tileSize;
		worldY = row*tileSize;
		this.type = type;
		try {
			LoadImage(type);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void LoadImage(int type) throws IOException {
		if(type == 0) {
			tileImage = ImageIO.read(getClass().getResourceAsStream("/Images/GrassBlock.png"));
		}
		else if(type == 1) {
			tileImage = ImageIO.read(getClass().getResourceAsStream("/Images/BrickBlock.png"));
		}
		else if(type == 9) {
			tileImage = ImageIO.read(getClass().getResourceAsStream("/Images/Void.png"));
		}
		else if(type == 8) {
			tileImage = ImageIO.read(getClass().getResourceAsStream("/Images/GrassBlock.png"));
		}

	}
	
	



	public static int getTileSize() {
		// TODO Auto-generated method stub
		return tileSize;
	}

	public Image getImage() {
		// TODO Auto-generated method stub
		return tileImage;
	}

	public int getWorldX() {
		return worldX;
	}

	public int getWorldY() {
		return worldY;
	}

	public int getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
