package Basic_Codes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sorting {
	
	public static void sort() {
		
		Integer[] a = {10,15,20,9,60,8,100};		
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(a));
		
		Collections.sort(aList);
	
		Iterator it = aList.iterator();	
		while(it.hasNext()) {
			Object ab = it.next();
			System.out.print(ab+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sorting.sort();
		
		Integer[] arr = {10,15,20,18,6,5,200,-5,50,20};
		
		System.out.print("Before Sorting : ");
		for(int i=0 ; i<=arr.length-1 ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		List<Integer> list = Arrays.asList(arr);
		
		TreeSet<Integer> al = new TreeSet<Integer>(list);
		
		System.out.println("After Sorting : "+al);
	}
}

/*Output is : 
	Before Sorting : 10 15 20 18 6 5 200 -5 50 20 
	After Sorting : [-5, 5, 6, 10, 15, 18, 20, 50, 200]
*/