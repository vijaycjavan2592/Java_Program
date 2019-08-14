package Basic_Codes;

import java.util.ArrayList;
import java.util.List;

public class AlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hhs83847hghfd989sdas45adsasda45asasas";
		
		char[] c = str.toCharArray();
		
		String s = "";
		List<String> list = new ArrayList<String>();
		for(Character ch : c) {
			
			try {
				int n = Integer.parseInt(ch.toString());
				//System.out.print(n);
				s = s + n;
				
			}catch(NumberFormatException e) {
				//System.out.print(s);
				if(!s.isEmpty())
					list.add(s);
				s = "";
			}
		}
		
		if(!s.isEmpty())
			list.add(s);
		System.out.print(list);

	}

}
