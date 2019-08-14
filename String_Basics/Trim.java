package String_Basics;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "      This is a BeginnersBook tutorial   ";
		
		System.out.println("Before trim : "+str);

		System.out.println("After trim : "+str.trim());		
	}
}
/*Output is : 
	Before trim :       This is a BeginnersBook tutorial   
	After trim : This is a BeginnersBook tutorial*/
