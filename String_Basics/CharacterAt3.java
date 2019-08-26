package String_Basics;

public class CharacterAt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Javatpoint portal";

		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 't') {
				count++;
			}
		}
		System.out.println("Count of char is : " + count);

		int count1 = 0;
		for (char j = 'a'; j <= 'z'; j++) {

			for (int k = 0; k <= str.length() - 1; k++) {
				if (str.charAt(k) == j) {
					count1++;
				}
			}
			if (count1 != 0) {
				System.out.println("count of " + j + " character is " + count1);
				count1 = 0;
			}
		}
	}
}

/*Output is : 
	Count of char is : 4
	count of a character is 3
	count of c character is 1
	count of e character is 2
	count of i character is 1
	count of l character is 2
	count of m character is 1
	count of n character is 1
	count of o character is 4
	count of p character is 2
	count of r character is 1
	count of t character is 4
	count of v character is 1*/