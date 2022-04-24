package inheritance;

class employee {
	 String name;
	 int emp_id;
	 int salary;

	public void getempdetails() {
		System.out.println("employee name:   " + name);
		System.out.println("employee id:     " + emp_id);
		System.out.println("employee salary:  " + salary);
	}
}

class manager extends employee {
	public manager(String mname, int mempid, int msal) {
		name = mname;
		emp_id = mempid;
		salary = msal;
	}

	public void getmanagerdetail() {
		getempdetails();
	}
}
	class accountent extends employee {
		public accountent(String aname, int aid, int asal) {
			name = aname;
			emp_id = aid;
			salary = asal;
		}

		public void getaccountentdetail() {
			getempdetails();
		}
	}

	public class Test {
	public static void main(String[] args) {
		manager m = new manager("pradeep",786,45000);
				m.getmanagerdetail();
				System.out.println("----------------------------");
				
		accountent a = new accountent("sibu",307,48000);
		accountent a1=new accountent("shrivastava",543,52000);
		      a.getaccountentdetail();
		      a1.getempdetails();
		
	}

}
