package dailyAssessments;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int number = sc.nextInt();
		
		boolean isPrime = true;
		
		if(number <= 1) 
		{
			isPrime = false;
		}
		else {
			
			for(int i = 2; i < number; i++)
			{
				if(number % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
	
	if(isPrime)
	{
		System.out.println(number+ "is a prime number");
		
	}
	 
	else
	{
		System.out.println(number+" is not a prime number");
	}
	
	}*/

		
		int num = 97;
		int count = 0;
		
		for(int i = 1; i<=num;i++)
		{
			if(num % i== 0)
			{
				count++;
			}
		}
		
		if (count == 2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}		
}
	
