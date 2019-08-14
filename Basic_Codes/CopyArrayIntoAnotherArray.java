package Basic_Codes;

public class CopyArrayIntoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 15, 5, 60, 3, 80 };

		int[] arr1 = new int[arr.length];

		for (int i = 0; i <= arr.length - 1; i++) {
			arr1[i] = arr[i];
		}

		// Displaying elements of array arr1
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// Displaying elements of array arr2
		System.out.println("Elements of new array: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}

/*Output is : 
	Elements of original array: 
		10 15 5 60 3 80 
		Elements of new array: 
		10 15 5 60 3 80 
		*/