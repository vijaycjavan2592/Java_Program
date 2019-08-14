package Basic_Codes;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		
		System.out.println("Before Swapping : "+a +" and "+ b);
		
		a = a + b;  // 3
		b = a - b;  // 1
		a = a - b;  // 2
		
		System.out.println("After Swapping : "+a +" and "+ b);
	}
}
