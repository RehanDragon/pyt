import java.util.Scanner;

// input a number to print its  powers in that range


//  matlab ya k kitne bar a rahe ha aus ke power jehan tk mujha smjh aya

public class InputNumberToPrintPower {
static int power;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		start 20 , end = 100 , num = 2
		
//		 jo powers a rahe hain aunhain print kr wana ha 
		Scanner input = new Scanner(System.in);
		int base,exponent,i;
		
i=1;
base=2; //11 , 2 , input.nextInt();
exponent = 20; //3,20 , input.nextInt(); // this is the power
power=1; //3 , input.nextInt(); // 

		while(i<=exponent) 
		{
			
//		now formula come 	
			
//			power = power*base 
			power=power*base;
//			ya if just pahle statement ko run krne k lia aistmal hota ha so readers dont get confused
			if(power >=20 && power <=100)
			System.out.println(  base+" for the power of " + exponent + " has powers coming in range : "+power  );
			
			i++;
		}
		
//		System.out.println(  base+"for the power of" + exponent + " = "+power  );

		
		
	}

}

//11for the power of3 = 1331 output came right 



/*
 * 
 * 
 * RIGHT CODE 
 * 
 static int power;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		start 20 , end = 100 , num = 2
		
//		 jo powers a rahe hain aunhain print kr wana ha 
		Scanner input = new Scanner(System.in);
		int base,exponent,i;
		
i=1;
base=11; //11
exponent = 3; //3
power=1; //3

		while(i<=exponent) 
		{
			
//		now formula come 	
			
//			power = power*base 
			power=power*base;
			
			
			
			i++;
		}
		
		System.out.println(  base+"for the power of" + exponent + " = "+power  );

		 
 * */


