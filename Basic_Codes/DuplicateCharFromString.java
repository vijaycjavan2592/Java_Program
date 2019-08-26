package Basic_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateCharFromString {
	
	public static void duplicate() {
		
		String str = "abacgdcd";
		
		char[] a = str.toCharArray();
		System.out.println(a);
		
		Map<Character,Integer> map = new HashMap<>();
		for(char c :a) {
		
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);

			}
		}
	System.out.println(map);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicateCharFromString.duplicate();
		
		String str = "This is a BeginnersBook tutorial";

		int count = 0;
		for (char i = 'a'; i <= 'z'; i++) {

			for (int j = 0; j <= str.length() - 1; j++) {

				if (i == str.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("Duplicate character is : " + i + " for " + count + " times");
			}
			count = 0;
		}
	}
}

/*Output is : 
	Duplicate character is : a for 2 times
	Duplicate character is : e for 2 times
	Duplicate character is : i for 4 times
	Duplicate character is : n for 2 times
	Duplicate character is : o for 3 times
	Duplicate character is : r for 2 times
	Duplicate character is : s for 3 times
	Duplicate character is : t for 2 times*/