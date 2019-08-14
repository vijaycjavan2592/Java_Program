package Basic_Codes;

public class ReverseString {
	
	public static void reverseStringusingStringBuffer() {
		String st = "Bottle";
		
		StringBuffer sb = new StringBuffer(st);
		
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString.reverseStringusingStringBuffer();
		
		String str = "xoriant";

		System.out.println("Given String is : " + str);

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse String is : " + reverse);
	}
}

/*Output is : 
	elttoB
    Given String is : xoriant
    Reverse String is : tnairox

*/