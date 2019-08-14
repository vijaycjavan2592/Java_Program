package Basic_Codes;

public class SplitAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "aaa_123_xyz_321_jdsfhjj";
		
		
		String[] b = a.split("//d+");
			//{"123", "345", "437", "894"};                    //"[a-zA-Z]+"
		
		System.out.println(b.length);
		int[] arr = new int[b.length];
		int sum = 0;
			for(int i=0 ; i<=b.length-1 ; i++) {
				
				//System.out.println(b[i]);
				
				String d = b[i];
				
				arr[i]=Integer.parseInt(d);
				
				System.out.println(arr[i]);
				
				sum = sum + arr[i];
				}
			System.out.println("sum is : "+sum);
			  
		}
		
	
}
