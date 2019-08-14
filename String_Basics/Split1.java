package String_Basics;

public class Split1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java string";  
		
		String [] ss = s1.split("t");
		
		System.out.println(ss[1]);  //Output : ring spli  -- split and store in array
		
		String reverse = "";
		String [] ss1 = s1.split("\\s");  //splits the string based on whitespace 
		for(String s : ss1) {
			
			//System.out.println(s);
			reverse = "";
			for(int i=s.length()-1 ; i>=0 ; i--) {
				reverse = reverse + s.charAt(i);
			}
			System.out.print(reverse+" ");			
		}
	}
}
/*Output is : 
	ring
	avaj gnirts */