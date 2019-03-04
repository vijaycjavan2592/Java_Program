package basic_Code;

public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		
		int ab , c=0;
		
		int temp = num;
		
		while(num>0){
			
			ab = num % 10; 
			num = num / 10;
			
			c = c + (ab*ab*ab);
		}
		System.out.println(c);
		
		if(temp==c){
			System.out.println("Number is Armstrong Number");
		}
		else{
			System.out.println("Number is not Armstrong Number");
		}

	}

}
