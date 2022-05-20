import java.util.Scanner;

public class MArkSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		

		System.out.println(" For Testing Purpose we had taken 600 as a total Percentage , each paper of 200 marks");
		float YourDefinedTotal = 600;
		
		
		
		System.out.println("  sub 1 marks out of 200 ? or according to your total value");
		
		float sub1= input.nextFloat();
		
//		formula = sub1*100/Total Marks Of Sub1
		
//		I am taking total marks as 200
		
		System.out.println(" Percentage of Sub 1 :"+sub1*100/200  );
		
		
		
		
		System.out.println("  sub 2 marks out of 200 ?  or according to your total value");
		float sub2= input.nextFloat();
		
		System.out.println(" Percentage of Sub 2 :"+sub2*100/200  );
		
		System.out.println("  sub 3 marks out of 200 ? or according to your total value");
		
		
		float sub3= input.nextFloat();
		
		
		System.out.println(" Percentage of Sub 3 :"+sub3*100/200  );
		
		
		
		float TotalMarksAchieved= sub1+sub2+sub3;
		
//		Total of 300 each paper 100 marks
		
		float percentage = (TotalMarksAchieved*100)/YourDefinedTotal;
		
		System.out.println("Your Percentage Is"+percentage);
		
		
		
		if(percentage >=96 && percentage <=100) {
			System.out.println(" Grade Point 4.0 ");
		}
		
		if(percentage >= 90 && percentage <=95 ) {
			System.out.println(" Grade Point 3.5 ");
			
		}
		
		if (percentage >= 84 && percentage <=89 ) {
			System.out.println("Grade point is 3.0");
			
		}
		
		
//		Now Making Induvidual Percentage Of Each Marks
		     
		
	}
          	
	
		
	}


