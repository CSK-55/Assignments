package week1.day2;

public class Assign_FibonacciSeries {

	public static void main(String[] args) {
		
		int num=7;   // Fibonacci series range will be declare here
		int i=0; 	 // Assign values for global variable
		int m=1;	 // Assign values for global variable
		
				
		System.out.println(i);  // print the value
						
		for (int l=1; l<=num; l++)   // for stmt is only for iteration
		{
			
			int n = i+m; 	// n-> 0+1 = 1  -- Sum value assign to local variable
			
			System.out.println(n);   // print the sum value
			
			i=m; 	// i= 1  --  values replaced by another variable(m)
			m=n; 	// m= 1  --  values replaced by another variable(n)
							
		}
	}
}
