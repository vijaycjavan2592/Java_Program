package Basic_Codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LargestElement_array {
	
	public static void largestElement() {
	
	Integer[] arr = {10,5,10,40,60,60,80,40,10,90};
	
	List<Integer> li = Arrays.asList(arr);
	
	HashSet<Integer> hs = new HashSet<Integer>(li);
	
	int ab = Collections.max(hs);
	
	System.out.println("Largest Element is : "+ab);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LargestElement_array.largestElement();
		
		int[] arr = {10,5,10,40,60,60,80,40,10};
		
		int max = arr[0];
		
		for(int i=0 ; i<=arr.length-1 ; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);

	}

}
