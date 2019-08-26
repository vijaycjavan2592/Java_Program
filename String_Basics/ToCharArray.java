package String_Basics;

public class ToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is a BeginnersBook tutorial";
		
		char[] ch = str.toCharArray();
		
		int length = ch.length;
		System.out.println(length);
		
		for(int i=0 ; i<=ch.length-1 ;i++) {
			System.out.print(ch[i]);
		}
	}
}
/*Output is : 
	32
	This is a BeginnersBook tutorial
	
	//toChatArray() method convert String into char*/