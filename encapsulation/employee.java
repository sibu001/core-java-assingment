package encapsulation;

class company {
	private int emp_id;
	private String name;

	public void setid(int id) {
		emp_id = id;
	}
	public void setName(String Name) {
		name=Name;
	}
	

	public int getid() {
		return emp_id;
	}
	public String getname() {
		return name;
	}
}

public class employee {
	public static void main(String[] args) {
		company e = new company();
		e.setid(1288);
		e.setName("pradeep");
		System.out.println(e.getid());
		System.out.println(e.getname());

	}

}
