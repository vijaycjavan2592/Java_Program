package codes;

import java.util.Arrays;

public class NoOfCharacInString {
	
	
	public void primeNumber(){
	int num = 7;
	
	boolean isPrime = true;
	
	for(int i = 2 ; i<num ; i++){
		
		if(num%i == 0){
			isPrime = false;
			break;
		}
	}
	if(isPrime){
		System.out.println("no is prime");
	}
	else{
		System.out.println("no is not a prime");
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoOfCharacInString n = new NoOfCharacInString();
		
		//n.primeNumber();
		
		String str = "abcdabma";
		
		char[] ch = str.toCharArray(); 
		
		System.out.println(ch.length);
		
		int count = 0;
		
		for(char i='a'; i<'z'; i++){
			
			for(int j=0 ; j<str.length(); j++){
				if(str.charAt(j)==i){
					
					count++;
				}
			}
			if(count!=0){
				System.out.println("Char "+ i +" "+ count);	
			}
			count = 0;
		}
	}
}
