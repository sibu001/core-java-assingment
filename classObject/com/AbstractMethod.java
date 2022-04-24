package classObject.com;

abstract class school {
	 abstract void show() ;{
		 System.out.println("welcome");
	 }
	 
}

	class managment extends school {
		void show() {
			System.out.println("beacon english school");}
		}
	

	class Students extends school {
		void show() {
			System.out.println("kusmunda branch");}
		}
	public class AbstractMethod {
	public static void main(String[] args) {
		Students s = new Students();
		s.show();
		managment m = new managment();
		m.show();
		
	}
	}
 
