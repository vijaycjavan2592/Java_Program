package Basic_Codes;

import java.util.ArrayList;
import java.util.List;

public class GetNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hfjdf2434vdfgj6767";
		
		char[] b = a.toCharArray();
		
		List<String> li = new ArrayList<String>();
		
		String s = "";
		
		for(Character c : b) {
			
			try {
				int n = Integer.parseInt(c.toString());
				
				s = s + n;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				if(!s.isEmpty()) {
					li.add(s);
					s="";
				}				
			}			
		}
		if(!s.isEmpty()) {
			li.add(s);
			System.out.println(li);
		}
	}
}
