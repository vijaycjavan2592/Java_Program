package Basic_Codes;

public class CountOfNumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This this is done by Vijay";
		
		String [] arr = str.split("\\s");
		
		System.out.println(arr.length);

	}

}
