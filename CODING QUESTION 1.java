package quiz2;

import java.util.Scanner;


public class QUESTION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numClass;
		int ClassAtt;
		double per = 0;

		Scanner input=new Scanner(System.in);
		     

		
		
		if(per<75){
			System.out.println("Enter the number of class");
			numClass = input.nextInt();
			System.out.println("Enter the number of class attend");
			ClassAtt =input.nextInt();
			per=(ClassAtt*100)/numClass;
			System.out.println("percentage : " +per);
			System.out.println("You can't sit for exam");
		}
		else {
			System.out.println("Enter the number of class");
			numClass = input.nextInt();
			System.out.println("Enter the number of class attend");
			ClassAtt =input.nextInt();
			per=(ClassAtt*100)/numClass;
			System.out.println("Percentage : " +per);
			System.out.println("You can sit for exam");
		}
		    

	}

}
