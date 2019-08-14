package String_Basics;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "";
		
		String s2 = "Welcome to Javatpoint portal";
		
		if(s1.length()==0 || s1.isEmpty()) {
			System.out.println("String s1 is empty");
		}
		else {
			System.out.println(s1);
		}
		
		if(s2.length()==0 || s2.isEmpty()) {
			System.out.println("String s2 is empty");
		}
		else {
			System.out.println(s2);
		}
	}
}

/*Output : 
	String s1 is empty
	Welcome to Javatpoint portal*/
