package String_Basics;

public class CharacterAt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "india";
		
		int length = str.length();
		
		System.out.println(length); //Output : 5
		
		System.out.println(str.length()-1);  //Output : 4
		
		char ch = str.charAt(4);
		
		System.out.println(ch);  //Output : a	
		
		System.out.println("Character at last index is : "+str.charAt(str.length()-1));  //Output : Character at last index is : a
		
		
		
	}

}
