package Basic_Codes;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total_num;
		
		int num[] = {1,2,3,4,5,7};
		
		System.out.println(num.length);
		
		total_num = num.length +1;
		int num_sum = 0;
		
		int expected_num_sum = total_num * ((total_num+1)/2);
		
		for(int i : num) {
			
			num_sum = num_sum + i;			
		}
		System.out.println(expected_num_sum - num_sum);

	}

}
