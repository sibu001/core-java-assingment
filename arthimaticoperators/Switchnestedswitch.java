package arthimaticoperators;

public class Switchnestedswitch {

	public static void main(String[] args) {
		int i=40;
		int j=60;
		switch(i) {
//		value of i transfer to case
		case 40:
			switch(j)
			{ case 42:
			System.out.println("mid large");
			break;
			case 50:
				System.out.println("extra large");
				break;
				default:
					System.out.println("no match in large");}
			
		case 29:
			System.out.println("khatam size");
			break;
		case 32:
			System.out.println("medium");
			break;
			default:
				System.out.println("no match");
		}
		
		// TODO Auto-generated method stub

	}

}
