package classObject.com;


public class Per {
	String name;
	 int age;    // all are fields
	 String city;
	 String gender;
	 public Per(String name,int age,String city,String gender) {
		 this.name= name;
		 this.age = age;
		 this.city=city;
		 this.gender = gender;
	 }
	 public void show() {
		 System.out.println("Per [name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender + "]");
		
	 }

	 
	 public static void main(String[] args) {
		 Per jhon = new Per("jhon",30,"indore","male");
		 jhon.show();
	 

		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Per [name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender + "]";
	}}
		// TODO Auto-generated method stub

	
		 
	 


