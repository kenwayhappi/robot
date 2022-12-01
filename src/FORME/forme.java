package FORME;

public class forme {
	protected double sur, peri;
	
	public forme() {
		this.sur=0.0;
		this.peri=0.0;
	};
	public forme(double sur, double peri) {
		this.sur=sur;
		this.peri=peri;
	};

	static double perip(double a, double b) {
		double p;
		p = (a + b)*2;
		return p;
	}
	static double peric(double c) {
		double p;
		p = c*4;
		return p;
	}
	static double pericer(double c) {
		double p;
		p = c*2*3.14;
		return p;
	}
	
	static double surr(double a, double b) {
		double s;
		s = a*b;
		return s;
	}
	static double surc(double c) {
		double s;
		s = c*c;
		return s;
	}
	static double surce(double c) {
		double s;
		s = c*c*3.14;
		return s;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


 