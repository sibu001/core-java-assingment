package factorypattern;

abstract class rbi {
	double rate;

	abstract void getrate();

	void m1(int t, int p) {
		System.out.println(t * p * rate / 100);
	}
}

class sbi extends rbi {

	@Override
	void getrate() {
		rate = 5.5;
	}
}

class axis extends rbi {

	@Override
	void getrate() {
		rate = 5.8;
	}

}

class baroda extends rbi {

	@Override
	void getrate() {
		rate = 6;
	}
}

class factorypattern {
	public rbi JOJO(String ChoiceType) {
		if (ChoiceType == null) {
			return null;
		}
		if (ChoiceType.equalsIgnoreCase("SBI")) {
			return new sbi();
		}
		if (ChoiceType.equalsIgnoreCase("axis")) {
			return new axis();
		}
		if (ChoiceType.equalsIgnoreCase("baroda")) {
			return new baroda();
		}
		return null;

	}
}

public class Main {
	public static void main(String[] args) {
		factorypattern f = new factorypattern();
		rbi r = f.JOJO("axis");
		r.getrate();
		r.m1(3, 100);

	}
}
