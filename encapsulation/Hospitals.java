package encapsulation;
 class patient{
	private String Name;
	private int p_id;
	
	public void setnme_id(String name,int id) {
		Name=name;
		p_id= id;
	}
	//public void setid(int id) {
	//	p_id=id;
	//}
	
	public  String  getname() {
		return Name;
	}
	public int getid() {
		return p_id;
	}
	
	
}

public class Hospitals {
	public static void main(String[] args) {
		patient p = new patient();
		p.setnme_id("pradeep",123);
	
		System.out.println(p.getid());
		System.out.println(p.getname());
		
		
	}

}
