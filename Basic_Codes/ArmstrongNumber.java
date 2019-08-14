package Basic_Codes;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		
		int c = 0,a,temp;
		temp = num;
		
		while(num>0) {
			a = num%10;
			num = num/10;
			c = c+(a*a*a);			
		}
		if(temp==c) {
			System.out.println("Number is armstrong number");
		}
		else {
			System.out.println("Number is not armstrong number");
		}
	}
}

/*Output is : 
	Number is armstrong number
*/