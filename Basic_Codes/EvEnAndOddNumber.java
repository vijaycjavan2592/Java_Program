package Basic_Codes;

public class EvEnAndOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 5, 8, 9, 100, 45 };

		System.out.print("Even numbers are : ");
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Odd numbers are : ");
		for (int j = 0; j <= a.length - 1; j++) {
			if (a[j] % 2 != 0) {
				System.out.print(a[j] + " ");
			}
		}
	}
}

/*Output is : 
	Even numbers are : 10 8 100 
	Odd numbers are : 5 9 45 
	*/