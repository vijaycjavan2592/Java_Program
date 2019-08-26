package Basic_Codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FrequencyOfEachElement {
	
	public static void frequency() {
		
		List<Integer> li = Arrays.asList(10, 15, 5, 60, 3, 80,5,15,10,3,10);
		
		Set<Integer> hs = new HashSet<Integer>(li);
		for(int a : hs) {
			System.out.println(a+" times "+Collections.frequency(li, a));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrequencyOfEachElement.frequency();
		
/*		int[] arr = { 10, 15, 5, 60, 3, 80,5,15,10,3,10};
		
		
		for(int i=0 ; i<=arr.length-1 ; i++) {
			int count = 1;
			for(int j=i+1 ; j<=arr.length-1 ; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count>0) {
				//System.out.println(arr[i] +" times "+count);
			}
			
		}

*/	}

}
