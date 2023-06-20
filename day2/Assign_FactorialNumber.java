package week1.day2;

public class Assign_FactorialNumber {

	public static void main(String[] args) {
		
		int n=1;
		int num=5;
		
		for (int i = 1; i <= num; i++)
		{
			n= (n*i); // n= (1*1) = 1
			
			System.out.println("Factorial of "+i+" is :"+ n);
		}
				
		System.out.println("*********************");
		
		System.out.println("Factorial of "+num+" is :"+ n);
		
		}

	}

