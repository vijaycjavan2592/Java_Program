package Basic_Codes;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Remove white spaces";  

		String str1 = str.replaceAll("\\s", "");
		
		System.out.println(str1);
	}
}

/*Output is : 
	Removewhitespaces
	*/