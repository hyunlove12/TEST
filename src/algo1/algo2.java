package algo1;

import java.util.Scanner;

public class algo2 {

	 int c = 0;
	   
	Scanner sc = new Scanner(System.in);
	
	  //b += a;
    
    
	public void method() {
			
		
		for(int e = 0;e<3;e++) {
		String a = sc.nextLine();
	    
		
		
		//x % 10 -> 첫 째자리
		//x /10 %10 -> 둘 째 자리
		//x /100 %10 -> 셋 째 자리
		
	    String str = String.valueOf(a);
		}	

				//String str = String.valueOf('');
				//Interger.parseInt(str.subString(3,4)) -> 1
				//str.subString(
				
			for(int d=0;d<4;d++) {
		c +=	Integer.parseInt(str.substring(d, d+1));
			
			
			}
	
		switch(c){
		case 0 : System.out.println("A"); break;
		case 1 : System.out.println("B"); break;
		case 2 : System.out.println("C"); break;
		case 3 : System.out.println("D"); break;
		case 4 : System.out.println("E"); break;

 	  }
	} 
	
}
