import java.util.Scanner;

public class PrintingTables {
	static int table_you_want_to_print,limitDefiner ,i,tablePrint;
 static Scanner	limitDefine,input;
  
	
	
//	static Scanner limitDefine = new Scanner(System.in);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i =1;
		limitDefine = new Scanner(System.in);
		input = new Scanner(System.in);
		
		System.out.println("The Table You Want To Print ? ");
		
		table_you_want_to_print =input.nextInt();
	System.out.println("  ");
	
	System.out.println(" Define Your limit ");
	
	System.out.println(" ");
		 limitDefiner=limitDefine.nextInt();
		 System.out.println(" ");
	
		 
	while (i<=limitDefiner)
	{
		tablePrint= table_you_want_to_print*i;
		System.out.println(tablePrint);
		i++;
		
	}
	
//	Print Table
	
//	starting
//     int table_you_want_to_Print=input.nextInt();
//     
//     int i=1;
//	
//    while( table_you_want_to_Print <=20 ) {
//    	
//    	
//    	int table= table_you_want_to_Print*i;
//    	
//  
//    	
//    
//    
//    }		
	
	
// int fact = input.nextInt();
// int f = 1
	
//	when we do processing inside loop we print outside the loop
	
//	input a number to print its power in that range 
	
//	input start and endpoint also check invalid range
	
//	ex: start = 20 end = 100  num =2
	
	
//	ex start = 5 end =69 num = 2 output => 8 16 32 64
	

	
//	int start =5;
//	int end = 69;
//	int num=2;
//	while (num > 70 ) {
//		num =start+3;
//		
//		System.out.println(num);
//		num=start*8;
//	
//	}
//	
	
	
	
	
	}

}
