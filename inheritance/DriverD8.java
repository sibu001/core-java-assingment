package inheritance;
class emp{
	String name;
	int age;
	private int salary=20000;
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public int getsalary() {
		return this.salary;
	}
	}
class manage extends emp{
	int bonus=10000;
	public int getsalary() {
		return super.getsalary()+bonus;
	}
	
}

public class DriverD8 {
	public static void main(String[] args) {
		manage m = new manage();
		System.out.println("manager salary+bonus:"   +m.getsalary());
		
		
		
	}

}
