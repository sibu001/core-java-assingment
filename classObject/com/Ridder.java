package classObject.com;
class rbi{
	public int getintrest() {
		return 6;
		}
}
class icici extends rbi {
	 public int getintrest() {
		return 7;
	}}
	class sbi extends rbi{
		public int getintrest() {
			return 8;
		}
	}


public class Ridder {
	public static void main(String[] args) {
		rbi r= new rbi();
		System.out.println(r.getintrest());
		
	}

}
