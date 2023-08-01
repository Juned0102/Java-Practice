package Practice1;

public class StarPattern {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {                         // o/p  =>  *
			for(int j=1;j<=i;j++) {                     //           *   
				                                        //            *
				if(i>=2 && j<=i-1) {                    //             *
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
			
	     }
	System.out.println("=================");	
		
		for(int i=1 ;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");            // o/p is =>          *
			}                                     //                   *
			for(int k=1;k<=i;k++) {               //                  *  
				if(i>1 && k>1) {                  //                 *
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		for(int i =5;i>=1;i--) {
			
			for(int j=5;j>i;j--) {                           // o/p is  *       *
				System.out.print(" ");                       //          *     *   
			}                                                //           *   * 
			for(int k=1;k<(i*2);k++) {                       //            * *   
				if (k>1 && k<(i*2)-1) {                      //             *
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("====================");
			
		for(int i=1;i<=5;i++) {
			for(int k =5;k>=i;k--) {                   // o/p is            * 
				System.out.print(" ");                 //                  * *
			}                                          //                 *   *
			for(int j=1;j<(i*2);j++) {                 //                *     *    
				if(j>1 && j<(i*2)-1) {                 //               *       *  
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {                  // o/p is  =>   *   *  
				if(i==j  ||  i+j==5-1) {            //               * * 
					System.out.print("*");          //                *
				}                                   //               * * 
				else {                              //              *   * 
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}
	

    }
