package factorypattern;
 abstract class Plan {

	protected double rate;
	
	public abstract void getRate();               // abstract method dont have body//
	
	public void calculateBill(int units) {                   // unimplemented or non abstract method//
		System.out.println(units*rate);
	}
}
 class CommercialPlan extends Plan{
	CommercialPlan(){
		System.out.println("in CommercialPlan");
	}
	@Override
	public void getRate() {                     //override  abstract method//
		rate=7.50;
		
	}
}
 class DomesticPlan extends Plan{

	DomesticPlan(){
		System.out.println("in DomesticPlan");
	}
	@Override
	public void getRate() {
		rate =3.50;
		}}
 class InstitutionalPlan extends Plan{
	InstitutionalPlan(){
		System.out.println("in InstitutionalPlan");
	}
	@Override
	public void getRate() {
		rate =5.50;
		
	}

}
 class GetPlanFactory {

	
	public Plan getPlan(String planType) {
		if(planType==null) {
			return null;
		}
		
		if(planType.equalsIgnoreCase("domestic")) {
			return new DomesticPlan();
		}else if(planType.equalsIgnoreCase("Commercial")) {
			return new CommercialPlan();
		}else if(planType.equalsIgnoreCase("institutional")) {
			return new InstitutionalPlan();
		}else {
			return null;
		}
	}
	
}

public class Driver {
public static void main(String[] args) {
			
			GetPlanFactory planFactory= new GetPlanFactory();
			
			Plan p =planFactory.getPlan("commercial");
			p.getRate();
			p.calculateBill(12);
		}
	}


