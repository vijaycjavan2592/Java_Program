package Basic_Codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DuplicateElementFromArray {
	
	public static void duplicate() {
		
		Integer[] arr = {10,5,10,40,60,60,80,40,10};
		
		List<Integer> li = Arrays.asList(arr);
		
		HashSet<Integer> hs = new HashSet<Integer>(li);
		
		for(int a : hs) {
			System.out.println(a+" times "+Collections.frequency(li, a));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateElementFromArray.duplicate();
		
		int[] arr = {10,5,10,40,60,60,80,40,10};
		
		int count= 0;
		
		for(int i=0 ; i<=arr.length-1 ;i++) {
			
			for(int j=i+1 ; j<=arr.length-1 ; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
