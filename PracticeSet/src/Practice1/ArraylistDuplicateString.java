package Practice1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArraylistDuplicateString {
	public static void main(String[] args) {
		
// finding duplicate String using ArrayList		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("shaikh");
		names.add("juned");
		names.add("book");
		names.add("shaikh");
		names.add("juned");
		
		Set s = new HashSet<>(); 
		for(String name:names) {
			if(s.add(name)== false) {
				System.out.println(name);
			}
		}
		
		
		
		
		
		
		
		
	}
	
	
	

}
