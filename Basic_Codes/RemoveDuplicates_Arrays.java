package Basic_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {10,5,10,40,90,60,80,40,10,-5,-10};
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		
		Collections.sort(al);
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(al);
				
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
				

	}

}
