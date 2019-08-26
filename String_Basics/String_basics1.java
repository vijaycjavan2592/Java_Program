package String_Basics;

public class String_basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "alpha";

		System.out.println(str.hashCode());

		str = "bravo";

		System.out.println(str.hashCode());

		str = "chaelie";

		System.out.println(str.hashCode());
		
		String ab = new String("delta");
		
		System.out.println(ab.hashCode());
		
		ab = "echo";
		
		System.out.println(ab.hashCode());
		
		StringBuffer sb = new StringBuffer("echo");
		
		System.out.println(sb.hashCode());
		
		System.out.println(sb.append(" + abcs"));
		
		System.out.println(sb.hashCode());
		
		StringBuilder ss = new StringBuilder("foxtrot");
		
		System.out.println(ss.hashCode());
		
		System.out.println(ss.append(" + golf"));
		
		System.out.println(ss.hashCode());
		
		
	

	}

}
