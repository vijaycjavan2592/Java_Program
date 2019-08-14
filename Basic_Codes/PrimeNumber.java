package Basic_Codes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2 ; i<=num ; i++) {
			
			if(i%2==0) {
				isPrime=false;
			}		
			else 
			{
				System.out.println(i +" is prime number");
			}
		}
	}
}

/*Output : 
	Enter the number : 
		10
		1 is prime number
		3 is prime number
		5 is prime number
		7 is prime number
		9 is prime number*/