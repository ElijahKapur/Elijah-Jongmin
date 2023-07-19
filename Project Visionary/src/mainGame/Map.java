package mainGame;

import java.io.IOException;

import backRooms.DataManipulation;
import utilites.FileAccess;

public class Map {
	
	
	//"C:\\Users\\Elija\\git\\Elijah-Jongmin\\Project Visionary\\mapData.txt"
	
	//change the string into the location of the file acording to its loaction in your files
	private static String mapLocation = "C:\\Users\\Elija\\git\\Elijah-Jongmin\\Project Visionary\\mapData.txt";
	private static Tile[][] WorldMap;
	
	public Map() {
		//loadMap();		
		
	}
	public static Tile[][] getMap() {
		return WorldMap;
	}
	
	public  void loadMap() {
		int col = 0;
		int row = 0;
		int counter =0;
		String tempMap = FileAccess.getFileAsString(mapLocation);
		WorldMap = DataManipulation.makeMap(tempMap);
		for(int i=0; i<tempMap.length(); i++) {
			//System.out.println(WorldMap[0].length);
			if(counter== WorldMap[0].length) {
				row+=1;
				col=0;
				counter=0;
				i+=2;
			}
			else if(!tempMap.substring(i, i+1).equals("\r") && !tempMap.substring(i, i+1).equals("\n") && !tempMap.substring(i, i+1).equals(" ") && !tempMap.substring(i, i+1).equals("n")){
				WorldMap[row][col] = new Tile(row,col,Integer.parseInt(tempMap.substring(i,i+1)));
				col+=1;
			}
			else if(tempMap.substring(i, i+1).equals("n")){
				WorldMap[row][col] = new Tile(row,col,9);
				col+=1;
				i-=1;
			}

			if(i<tempMap.length()) {
				if(!tempMap.substring(i, i+1).equals("\r") && !tempMap.substring(i, i+1).equals("\n")) {
					counter +=1;
				}
			}
			
		}
		System.out.println("Loaded");
	}
	public static Tile getSpawn() {
		for(Tile[] t:WorldMap) {
			for(Tile b:t) {
				//System.out.println(b.getRow()+"  " + b.getCol ());
				if(b.getType() == 8) {
					return(b);
				}
			}
		}
		System.out.println("No spawn on the map");
		return(null);
	}

	
}
