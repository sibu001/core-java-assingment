package classObject.com;
class employee{
	String name;
	int emp_id;
	protected employee(String name , int emp_id){
		this.name=name;
		this.emp_id=emp_id;
	}		
				
		
	}
	
	


public class ThisKeyWord {
	
	public static void main(String[] args) {
		employee e1 = new employee("sibu",20);
		employee e2 = new employee("pradeep",444);
		System.out.println(e1.name+" "+e1.emp_id);
		System.out.println(e2.name+" "+e2.emp_id);
		
		
	}

}
