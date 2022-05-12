import java.util.Scanner;

public class Percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner input = new Scanner(System.in);
		
		

		System.out.println("Hey lets first define your sub Total Value For Testing Purpose you can use 500");
		float YourDefinedTotal = input.nextFloat();
		
		
		System.out.println("  sub 1 marks out of 100 ? or according to your total value");
		
		float sub1= input.nextFloat();
		
		System.out.println("  sub 2 marks out of 100 ?  or according to your total value");
		float sub2= input.nextFloat();
		
		System.out.println("  sub 3 marks out of 100 ? or according to your total value");
		
		
		float sub3= input.nextFloat();
		
		System.out.println("  sub 4 marks out of 100 ? or according to your total value");
		float sub4= input.nextFloat();
		
		
		System.out.println("  sub 5 marks out of 100 ? or according to your total value");
		float sub5= input.nextFloat();
		
		
		
		float TotalMarksAchieved= sub1+sub2+sub3+sub4+sub5;
		
//		Total of 500 each paper 100 marks
		
		float percentage = (TotalMarksAchieved*100)/YourDefinedTotal;
		
		
		
	    System.out.println("Your Percentage Is"+percentage);
	    
	      
	      
		
	}

}
