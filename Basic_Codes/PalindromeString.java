package Basic_Codes;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "XoX";
		
		String reverse = "";
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			
			reverse = reverse + str.charAt(i);
		}		
		System.out.println("Reverse String is : "+reverse);
		
		if(str.equals(reverse)) {
			System.out.println("Given String is Palindrome string");
		}
		else
		{
			System.out.println("Given String is not Palindrome string");
		}
	}
}

/*Output is : 
	Reverse String is : XoX
	Given String is Palindrome string
	*/