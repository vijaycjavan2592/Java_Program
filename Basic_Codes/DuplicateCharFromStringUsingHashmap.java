package Basic_Codes;

import java.util.HashMap;

public class DuplicateCharFromStringUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asafsfasaaxsda";
		
		char[] c = str.toCharArray();
		
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		
		for(char ch : c) {
			
			if(m.containsKey(ch)) {
				m.put(ch, m.get(ch)+1);
			}
			else
			{
				m.put(ch, 1);
			}
		}
		System.out.println(m); 
		

	}

}
