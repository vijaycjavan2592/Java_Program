package String_Basics;

public class IndexOf_charac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is a BeginnersBook tutorial";
		
		String s1 = new String("Book");
		
		System.out.println("Index of B in s: "+s.indexOf('B'));
		
		System.out.println("Index of B in s after 11th char: "+s.indexOf('B', 11));
		
		System.out.println("Index of B in s after 30th char: "+s.indexOf('B', 30));
		
		System.out.println("Index of String s1 in s "+s.indexOf(s1));
		
		System.out.println("Index of k in s: "+s1.indexOf('k'));
		
		System.out.println("Index of hardcoded string: "+s.indexOf("is"));
		
		System.out.println("Index of hardcoded string after 4th char:"+s.indexOf("is", 4));
	}
}

/*Output is : 
	Index of B in s: 10
	Index of B in s after 11th char: 19
	Index of B in s after 30th char: -1
	Index of String s1 in s 19
	Index of k in s: 3
	Index of hardcoded string: 2
	Index of hardcoded string after 4th char:5*/
