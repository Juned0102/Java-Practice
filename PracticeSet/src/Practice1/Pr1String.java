package Practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Pr1String {
	
	public static void main(String[] args) {
		// find duplicate number
//		HashSet hs = new HashSet();
//		hs.add(10);
//		hs.add(20);
//		hs.add(15);
//		hs.add(11);                     // duplicate not allowed
//		System.out.println(hs);
//		System.out.println("===============");
//		// find the duplicate String
//		HashSet<String> h = new HashSet<String> ();
//		h.add("ABC");
//		h.add("CBA");
//		h.add("PQR");
//		h.add("ABC");                   // duplicate String
//		System.out.println(h);
//	
//
//		
//		//write in desending 	
//		ArrayList al = new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(15);
//		al.add(5);
//		al.add(10);                     // duplicate allowed in arraylist
//		System.out.println(al);
//		System.out.println("Disending order");
//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println(al);	
//		
//		al.set(0, 40);
//		System.out.println(al);
//
//		System.out.println(al.size());
//		System.out.println(al.contains(20));
//		System.out.println(al.get(4));
//		System.out.println(al.clone());
		

		String s = "go to gym " ;
		int count;
		
		char string [] = s.toCharArray();
		System.out.println("duplicate charecters in string: ");
		for(int i=0;i<string.length;i++) {
			count=1;
			for(int j=i+1;j<string.length;j++) {
				if(string [i]==string [j] && string [i] !=' ') {
					count++;
					string [j]='0';
					
				}
			}
			if (count>1 && string [i] !='0') {
				System.out.println(string[i]);
				
			}
			
		}
		
	}



}
