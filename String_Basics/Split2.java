package String_Basics;

public class Split2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss = "Welcome to Javatpoint portal";
		
		String [] arr = ss.split("\\s", 2);
		
		int length = arr.length;
		
		System.out.println(length);
		
		for(int i=0 ; i<=length-1 ; i++) {
			System.out.println(arr[i]);
		}
		
		for(String s : arr) {
			
			System.out.println(s);
		}

	}

}
