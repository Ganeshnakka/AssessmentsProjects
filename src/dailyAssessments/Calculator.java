package dailyAssessments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operator, n1, n2;
		int result = 0;
		System.out.println(" 1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Division");
		System.out.println("Choose operator");
		Scanner sc = new Scanner(System.in);
		operator = sc.nextInt();
		
		System.out.println("enter first number: ");
		n1 = sc.nextInt();
		
		System.out.println("enter Second number: ");
		n2 = sc.nextInt();
		sc.close();
		
		switch(operator)
		{
		case 1 :
			result = n1 + n2;
			break;
			
		case 2 :
			result = n1 - n2;
			break;
			
		case 3 :
			result = n1 * n2;
			break;
			
		case 4 :
			result = n1 % n2;
			break;
			
		default : 
			System.out.println("Entered valu is not valid");
		}
		
		System.out.println("result is : "+result);

	}

}
