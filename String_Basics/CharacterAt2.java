package String_Basics;

public class CharacterAt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		String str = "juliet";
		
		char ch = ' ';
		
		for(int i=0 ; i<=str.length()-1 ; i++) {
			ch = str.charAt(i);
			System.out.println(ch);
		}
		
		for(int j=0 ; j<=str.length()-1 ; j++) {
			if(j%2!=0) {
				System.out.println("Char at "+j+" place is :"+str.charAt(j));
			}
		}	

	}

}

/*OutPut is : 
	j
	u
	l
	i
	e
	t
	Char at 1 place is :u
	Char at 3 place is :i
	Char at 5 place is :t
*/
