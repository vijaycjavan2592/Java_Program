<<<<<<< HEAD
package Basic_Codes;

public class ArmstrongNumber {

=======
package basic_Code;

public class ArmstrongNumber {

	/**
	 * @param args
	 */
>>>>>>> d1f436fc4961835800c4ab0bc2821b9b5c3ba431
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		
<<<<<<< HEAD
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
=======
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
>>>>>>> d1f436fc4961835800c4ab0bc2821b9b5c3ba431
