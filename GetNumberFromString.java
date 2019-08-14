package JavaCodes;

import java.util.ArrayList;
import java.util.List;

public class GetNumberFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sr = "hff5556jnfjd656";
		
		char[] c = sr.toCharArray();
		
		String s = "";
		
		List<String> li = new ArrayList<String>();
		boolean isnumber = true;
		
		for(Character ch : c){
		try {
			int n = Integer.parseInt(ch.toString());	
			
			s = s + n;				
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			if(!s.isEmpty()){
				li.add(s);
				//System.out.println(li);
				s = "";
			}
		}
		}
		if(!s.isEmpty()){
			li.add(s);
			System.out.println(li);
			s = "";
		}
	}

}
