package string;

public class Restring {
	public static void main(String[] args) {
		String s = "tata";
		String reverse ="";
		for (int i = s.length() - 1; i >= 0; i--)
			
		{
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
//		if(s.equals(reverse)) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not a palindrome");
//		}

	}

}