
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
public class Random500 {
	public static void main(String[] args) {

// RANDOM FROM NUMBER		
		Random random = new Random();
		int x = random.nextInt(100);
		System.out.println("RANDOM NUMBER = " +x);
		System.out.println();
		
// RANDOM FROM ASCII				
		char c = (char)(random.nextInt(26)+'A'); 	//ASCII table
		System.out.println("RANDOM ASCII (for char) = " +c);
		System.out.println();System.out.println();
		
// RANDOM FROM STRING		
		String chars = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("FROM STRING = "+chars);
		System.out.println("    length()  = "+chars.length());
		System.out.println("Random length (index) = "+random.nextInt(chars.length()));
		char c2 = chars.charAt(random.nextInt(chars.length()));
		System.out.println("Random Char from index = "+c2);
		System.out.println(); System.out.println();
				
// RANDOM FROM 100-1000		
		System.out.println("RANDOM Number between 100-1000:");		
		for (int i=0;i<10; i++) {
			int r = random.nextInt(900)+100;
			System.out.print(r+" ");
		}
		System.out.println();System.out.println();System.out.println();

//	SORTED TREE SET (MUST GENERATE 100 numbers) 
		System.out.println("SORTED to TREE SET (always GENERATE 100 numbers):");
		TreeSet<Integer> treeSet = new TreeSet<>(); 
		for (int i=0;i<100; i++) {
			while (treeSet.size() !=100) {    			//set size always = 100
				int r = random.nextInt(900)+100;
				treeSet.add(r);
			}	
		}
		System.out.println(treeSet);
		System.out.println("size() (must always 100) = "+treeSet.size());
//TREESET TO OBJECT ARRAY	
		System.out.println();
		System.out.println("Convert TreeSet to object array for [indexing]");
		
		Object[] arrayConverted = treeSet.toArray(); 
		for (int i=0;i<10; i++) {
			System.out.println(arrayConverted[i]);
		}
		
		while (1==1) {									//always generate enough 100
			System.out.println("Pick rank smallest from 1 to 10:");	
			Scanner input = new Scanner (System.in);
			int rank = input.nextInt(); 
			if (rank > 10) {continue;}
			// System.out.println(treeSet.headSet(number).size());  //only works when used TreeSet declare
// CONVERT TREE to ARRAY to target INDEX			
			System.out.println("Rank "+rank+" smallest = "+arrayConverted[rank-1]);
			System.out.println();
		}
	}
}
