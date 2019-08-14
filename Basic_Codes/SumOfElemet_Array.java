package Basic_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SumOfElemet_Array {
	
	public static void sum() {
		int sum = 0;
		
		Integer[] arr = {10,5,10,40,60,60,80,40,10,-5};
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			int ab = it.next();
			sum = sum + ab;
		}
		System.out.println("Sum of array element is : "+sum);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfElemet_Array.sum();
		
		int[] arr = {10,5,10,40,60,60,80,40,10,-5,-10};
		
		int sum = 0;
		
		for(int a : arr) {
			sum = sum + a;
		}
		System.out.println("Sum of array element is : "+sum);
		
		//---------------------------------------
		
		int sum1 = 0;
		
		for(int i=0 ; i<=arr.length-1 ; i++) {
			
			sum1 = sum1 + arr[i];
		}
		System.out.println("Sum of array element is : "+sum1);
	}
}

/*Output is : 
	Sum of array element is : 310
	Sum of array element is : 310
	Sum of array element is : 310
*/