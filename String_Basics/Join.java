package String_Basics;

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringJoin1 = String.join("-", "Java", "C" , "Python");
		
		System.out.println(stringJoin1);
		
		String date = String.join("/", "29", "07", "2019");
		
		System.out.print(date);
		
		String time = String.join(":", "15", "44", "00");
		
		System.out.println(" "+time);
	}
}

/*Output is : 
	Java-C-Python
	29/07/2019 15:44:00*/
