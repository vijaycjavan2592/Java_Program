package String_Basics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Javatpoint portal";
		
		String reverse = "";
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse String is : "+reverse);
	}
}

/*Output is : 
	Reverse String is : latrop tnioptavaJ ot emocleW*/
