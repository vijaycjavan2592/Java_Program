package Basic_Codes;

public class SwapStringWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "XYZ";
		String b = "ABC";
		
		a = b+a;
		System.out.println(a);
		
		b = a.substring(3);
		System.out.println("b = "+b);
		
		a = a.substring(0, 3);
		System.out.println("a = "+a);
		

	}

}
