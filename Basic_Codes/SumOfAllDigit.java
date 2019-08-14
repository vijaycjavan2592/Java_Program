package Basic_Codes;

public class SumOfAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;

		int sum = 0, a;

		while (num != 0) {
			a = num % 10;
			num = num / 10;
			sum = sum + a;
		}
		System.out.println("Sum of given number is : " + sum);
	}
}

/*Output is :
	Sum of given number is : 15
	*/