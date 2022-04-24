package classObject.com;

class biodata {
	
	String name;
	int age;
   
	class addr {
		String city;
		String state;
		int pin;

		public void getaddr() {
			city = "korba";
			state = "cg";
			pin = 495454;
		}

		//addr a = new addr();

		public void getbio() {
			name = "pradeep";
			age = 30;

		}
	}
}

public class nesclass {
	public static void main(String[] args) {
		biodata b= new biodata();
		b.getbio();
		b.getaddr();

	}
}
