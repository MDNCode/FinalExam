import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound_ReadText {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		try {
// SHOW ORIGINAL TEXT			
			String path = "C:\\Users\\Minh\\workspace\\FinalExam\\tex.txt";		
			File file = new File(path);
			FileReader fileRead = new FileReader (file);
			BufferedReader buffRead = new BufferedReader (fileRead);//Buff/FileRead/File/path
	        
			String line = null;
			while ((line=buffRead.readLine()) != null){ //As long as line has content
				System.out.println(line);
			}
			System.out.println();System.out.println();
			buffRead.close();
		} 
		catch (IOException e) {
			System.out.println("File Does Not Exist");
			System.out.println();System.out.println();
		}
			
			
			
// SHOW SPLIT TEXT WITH INDEX
		try {
			String path = "C:\\Users\\Minh\\workspace\\FinalExam\\text.txt";		
			File file = new File(path);
			FileReader fileRead = new FileReader (file);
			BufferedReader buffRead = new BufferedReader (fileRead);			
			String text = null;
	        while ((text = buffRead.readLine())!= null) {	
	    // SPLIT at Dash        	
	            String[] splitDash=text.split("-");
	    		System.out.println("Split at dash, length = " + splitDash.length);
	    		for (int i=0;  i<splitDash.length;  i++) {
	    			System.out.println("index["+ i +"] = " +splitDash[i]);//display dash index
	    		}
	    // SPLIT at Comma     		
	    		String[] splitComma = splitDash[1].split(",");	
	    		System.out.println("Split at comma, length = "+splitComma.length);
	    		for (int i=0;  i<splitComma.length;  i++) {
	    			System.out.println("index["+ i +"] = " +splitComma[i]);//display comma index
	    		}
	    		System.out.println();
	    	}        
	        buffRead.close();
	        System.out.println();System.out.println();
		} 
		catch (IOException e) {
			System.out.println("File Does Not Exist");
			System.out.println();System.out.println();
		}
		
		
// SHOW SPLIT TEXT FINAL - 2D LOOP		
		try {
			String path = "C:\\Users\\Minh\\workspace\\FinalExam\\text.txt";		
			File file = new File(path);
			FileReader fileRead = new FileReader (file);
			BufferedReader buffRead = new BufferedReader (fileRead);			
			String text = null;
			while ((text = buffRead.readLine())!= null) {	
				String[] splitDash=text.split("-");
				for (int i=0;  i<splitDash.length;  i++) {
					String[] splitComma = splitDash[i].split(",");//2nd split(Comma) included 1st split (Dash
					for (int j=0;  j<splitComma.length;  j++) {
						System.out.println(splitComma[j]);
					}
				}	
			}
	        buffRead.close();
	        System.out.println();System.out.println();
		} 
		catch (IOException e) {
			System.out.println("File Does Not Exist");
			System.out.println();System.out.println();
		}
		
		
		
// SHOW SPLIT TEXT FINAL - FOR EACH LOOP - BETTER LESS CODE
		try {
			String path = "C:\\Users\\Minh\\workspace\\FinalExam\\text.txt";		
			File file = new File(path);
			FileReader fileRead = new FileReader (file);
			BufferedReader buffRead = new BufferedReader (fileRead);			
			String text = null;
	        while ((text = buffRead.readLine())!= null) {	
	        	String[] splitDash=text.split("-");
	    		for (int i=0;  i<splitDash.length;  i++) {
	    			for (String item: splitDash[i].split(",")) {
	    				System.out.println(item);	
	    			}
	    		}	
			}
			buffRead.close();
		} catch (IOException e) {System.out.println("File Does Not Exist");}
	}	
} 





	

