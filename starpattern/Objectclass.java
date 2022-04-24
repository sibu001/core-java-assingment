package starpattern;

public class Objectclass {
	public int add(int a, int b) {
		return (a + b);
	}

	public int sub(int i, int j) {
		return (i - j);
	}

	public int multiply(int l, int m) {
		return (l*m);
	}

	public int division(int o, int i) {
		return (o / i);
	}
	public void evenorodd(int a ) {
		if(a%2==0) {
			System.out.println("even");}
		else {
			System.out.println("odd");
			
		}
		
	}
	
	public static void main(String[] args) {
		Objectclass obj= new Objectclass();  
			int i= obj.add(5,8);
			int j= obj.sub(20,10);
			int k= obj.multiply(3,2);
			int l= obj.division(10,5);
			obj.evenorodd(29);
			System.out.println(i);
			System.out.println(j);
			System.out.println(k);
			System.out.println(l);}
	
	
			
		
	}
	
		
	
		
	


