package Basic_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseOrder_array {
	
	public static void reverse() {
		
		Integer[] arr = {10,5,10,40,60,60,80,40,10,-5};
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		
		Collections.reverse(al);
		
		for(int a : al) {			
			System.out.print(a+" ");			
		}
		System.out.println();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseOrder_array.reverse();

		int[] arr = {10,5,10,40,60,60,80,40,10,-5};
		
		int[] rev = new int[arr.length];
		
		for(int i=arr.length-1 ; i>=0 ; i--) {
			
			rev[i] = arr[i];
			
			System.out.print(rev[i]+" ");
		}		
	}
}

/*Output is : 
	-5 10 40 80 60 60 40 10 5 10 
	-5 10 40 80 60 60 40 10 5 10 
	*/
