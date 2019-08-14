package String_Basics;

public class LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is a BeginnersBook tutorial";
		
		System.out.println("Last 'B' in str1: "+str.lastIndexOf('B'));
		
		System.out.println("Last 'B' in str1 whose index<=70 : "+str.lastIndexOf('B', 70));

	}

}
/*OutPut is : 
	Last 'B' in str1: 19
	Last 'B' in str1 whose index<=70 : 19*/