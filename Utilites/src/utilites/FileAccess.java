package utilites;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAccess {
	
	public FileAccess(String pathWay) {
		
	}
	
	
	public static String readFileAsString(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        byte[] fileBytes = Files.readAllBytes(path);
        return new String(fileBytes);
    }
    
    //filePath = "C:\\Users\\Elija\\Downloads\\hi there.txt";
	//filePath = "C:\\Users\\Elija\\Downloads\\Java Folder\\EclipseWorkSpace\\Project Visionary\\mapData.txt";
    
    public static String getFileAsString(String filePath) {
        String fileContent = "";
    	try {
            fileContent = readFileAsString(filePath);
            //System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return(fileContent);
    }
	
	
	public static void add(String text,String pathWay) {
		 try (PrintWriter out = new PrintWriter(pathWay)) {
	           out.println(text);
	            out.close();
	        } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("File Not Found");
			} 
	}

}

