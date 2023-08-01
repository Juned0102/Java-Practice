package Practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class Pr2 {
	
	public static void main(String[] args) {
//		int i=10;
//		while(i>0) {
//			System.out.println(i);
//			
//			i++;
//		}
	
//		ArrayList al = new ArrayList();
//		al.add(1);
//		al.add(2);
//		al.add("three");
//		al.add(4);
//		
//	
//		System.out.println(al);
//		al.clone();
//		System.out.println(al);
//		
//		al.add(3, "four");
//     	System.out.println(al);
//		
//     	al.remove(4);
//     	System.out.println(al);
//     	
//     	ArrayList al1 = new ArrayList();
//     	al1.add(5);
//     	al1.add(6);		
//     	System.out.println(al1);
//     	
//     	
//		al.addAll(al1);
//		System.out.println(al);
   
// to duplicate number in array
//		int a[]= {1,2,3,4,1,2,3,4};
//		System.out.println("duplicates are ");
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[i]);
//				}
//			}
//		}
		
		// prime number 1-100
//	for(int no =1;no<=100;no++) {
//		int temp =0;
//		for(int i=2;i<=no-1;i++) {
//			if(no%i==0) {
//				temp=temp+1;
//			}
//		}
//		if(temp==0) {
//			System.out.println(no);
//		}
//	}
//	System.out.println("Duplicate in Array");	
		
//	
//	for(int i= 1;i<=1;i++) {
//		for(int j=1;j<=5;j++) {
//			System.out.print(" *");
//		}
//		System.out.println();
//	}
//	for(int i=1;i<4;i++) {
//		for(int j=1;j<=1;j++) {
//			
//			System.out.print(" *"+"       *");
//		}
//		System.out.println();		
//	}
//	for(int i= 1;i<=1;i++) {
//		for(int j=1;j<=5;j++) {
//			System.out.print(" *");
//		}
//		System.out.println();
//	}
//	
		
		
		
//			for(int j=1;j<=5;j++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		
//		for(int i=1;i<4;i++) {
//			for(int j=1;j<=1;j++) {
//				
//				System.out.print(" *"+"       *");
//			}
//			System.out.println();		
//		}
//		
//			for(int j=1;j<=5;j++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}	
//	
//	
		
//		
//			 int i = 5; 
//			 System.out.println(i++ + i-- + ++i + --i + i); 
//			 }

		// Q2 
//		for(int i=0;;)
//		 {
//		 System.out.println(i);
//		 }
//		 }
//		
		//Q3
//		String str = "Hello World";
//		 strFunc(str, 0);
//		 }
//		 public static void strFunc(String str, int i)
//		 {
//		 if(i==str.length())
//		 return;
//		 System.out.println(str.charAt(i));
//		 strFunc(str,i+1);
		 
		// Q4
//		 String str = "Hello World";
//		 strFunc(str, 0);
//		 }
//		 public static void strFunc(String str, int i)
//		 {
//		 if(i==str.length())
//		 return;
//		 else if(str.charAt(i)!=' ')
//		 System.out.print(str.charAt(i));
//		 strFunc(str,i+1);
	
//		String str = "Hello World";
//		 for(int i=0;;i++)
//		 if(i==str.length())
//		 break;
//		 else if(str.charAt(i)!=' ')
//		 System.out.print(str.charAt(i));

		String s= "java123";
		String di = s.replaceAll("[^1-9]", " ");
		System.out.println(di);
		
		
		
		
		
	
	}	
}