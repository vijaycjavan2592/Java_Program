package String_Basics;

public class ValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		byte b = 15;
		boolean bool = true;
		char ch[] = {'a','c','z'};
		
		String s1 = String.valueOf(i);
		System.out.println(s1);
		
		String s2 = String.valueOf(b);
		System.out.println(s2);	
		
		String s3 = String.valueOf(bool);
		System.out.println(s3);
		
		String s4 = String.valueOf(ch);
		System.out.println(s4);
	}
}
/*Output is : 
	10
	15
	true
	acz
*/
