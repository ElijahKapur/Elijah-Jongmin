package mainGame;

import java.io.IOException;

import utilites.FileAccess;

public class Map {
	
	
	//C:\\Users\\Elija\\Downloads\\Java Folder\\EclipseWorkSpace\\Project Visionary\\mapData.txt
	
	//change the string into the location of the file acording to its loaction in your files
	private static String mapLocation = "C:\\Users\\Elija\\Downloads\\Java Folder\\EclipseWorkSpace\\Project Visionary\\mapData.txt";
	private static Tile[] WorldMap;
	
	public Map() {
		loadMap();		
		
	}
	public static Tile[] getMap() {
		return WorldMap;
	}
	
	public void loadMap() {
		int col = 0;
		int row = 0;
		int counter =0;
		String tempMap = FileAccess.getFileAsString(mapLocation);
		int totalTiles =0;
		for(int i=0; i<tempMap.length(); i++) {
			if(!tempMap.substring(i, i+1).equals("\r") && !tempMap.substring(i, i+1).equals("\n") && !tempMap.substring(i, i+1).equals("n") && !tempMap.substring(i, i+1).equals(" ")) {
				totalTiles+=1;
			}
		}
		WorldMap = new Tile[totalTiles];
		for(int i=0; i<tempMap.length(); i++) {
			if(tempMap.substring(i, i+1).equals("n")) {
				row+=1;
				col=0;
			}
			else if(!tempMap.substring(i, i+1).equals("\r") && !tempMap.substring(i, i+1).equals("\n") && !tempMap.substring(i, i+1).equals(" ")){
				WorldMap[counter] = new Tile(row,col,Integer.parseInt(tempMap.substring(i,i+1)));
				col+=1;
				counter+=1;
			}
		}
		
	}
	public static Tile getSpawn() {
		for(Tile t:WorldMap) {
			if(t.getType() == 8) {
				return(t);
			}
		}
		System.out.println("No spawn on the map");
		return(null);
	}

	
}
