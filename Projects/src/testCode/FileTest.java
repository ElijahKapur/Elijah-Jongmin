package testCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import utilites.FileAccess;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {
	

	    public static String readFileAsString(String filePath) throws IOException {
	        Path path = Paths.get(filePath);
	        byte[] fileBytes = Files.readAllBytes(path);
	        return new String(fileBytes);
	    }
	    
	    //filePath = "C:\\Users\\Elija\\Downloads\\hi there.txt";
    	//filePath = "C:\\Users\\Elija\\Downloads\\Java Folder\\EclipseWorkSpace\\Project Visionary\\mapData.txt";
        
	    public String getFileAsString(String filePath) {
	        String fileContent = "";
	    	try {
	            fileContent = readFileAsString(filePath);
	            System.out.println(fileContent);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return(fileContent);
	    }
	}


	
	
	

