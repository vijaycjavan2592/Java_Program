package Basic_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SequenceOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		int[] arr = null;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i : a) {
			al.add(i);		
		}
		System.out.println("Array is + "+al);
		
		Collections.sort(al);
		Iterator<Integer> it1 = al.iterator();
		while(it1.hasNext()) {
			 Object ab1 = it1.next();
			 System.out.println(ab1.equals(ab1));
			 
		}
		int count = 0;
		Object[] ab = al.toArray();
		System.out.println("Size is "+ab.length);
		for(int i=0 ; i<=ab.length-2 ; i++) {
			//System.out.println(ab[i]);
			
				if(ab[i]==ab[i+1]) {
					count++;					
				}
		
			}
		*/
		
		int[] a = {10,11,12,13,40,50,51,52,61,62};

		for(int i=0; i<a.length;) {
		
			boolean isContinous=true;
			int cur = a[i];
			int j = i+1;
			boolean isFirst = true;
			while(isContinous) {
				
				if(j < a.length) {
					if(cur+1 == a[j]) {
						
						if(isFirst) {
							System.out.println(cur);
							isFirst = false;
						}
						
						isContinous = true;
						cur = a[j];
						System.out.println(cur);
						j++;
						
						
					}else {
						isContinous = false;
					}
				}else {
					isContinous = false;

				}
				
				
			}
			i = j;
			
		}
		System.out.println("exit");

	}

}
