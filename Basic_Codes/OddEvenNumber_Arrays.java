package Basic_Codes;

public class OddEvenNumber_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,35,45,50,-5,-10};
		
		System.out.println("Even element is : ");
		for(int i=0 ; i<=arr.length-1 ; i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i]+" ");
			}			
		}
		System.out.println();
		
		System.out.println("Odd element is : ");
		for(int i=0 ; i<=arr.length-1 ; i++) {
			if(arr[i]%2 != 0) {
				System.out.print(arr[i]+" ");
			}			
		}
		
		
		
	}

}
