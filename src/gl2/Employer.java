package gl2;
public class Employer {
		protected String n,p;
		protected double sal;
		private int cni;
		
		public Employer() {
			this.n="";
			this.p="";
			this.sal=0.0;
			this.cni=0;
		};
		public Employer(int cni) {
			this.cni=cni;
		}
		public String getN() {
			return n;
		};
		public Employer(String n, String p) {
			this.n=n;
			this.p=p;
		}
		public Employer(String n, String p, double a, int b) {
			this.n=n;
			this.p=p;
			this.sal=a;
			this.cni=cni;
		}
		public void setN(String n) {
			this.n=n;
		};
		public String getP() {
			return p;
		};
		public void setP(String p) {
			this.p=p;
		};
		public double getSal() {
			return sal;
		};
		public void setSal(double sal) {
			this.sal=sal;
		};
		public int getCni() {
			return cni;
		};
		public void setCni(int cni) {
			this.cni=cni;
		};
		public void affiche() { 
			System.out.println("bonjour "+this.n+ " "+ this.p +" votre salaire est de "+ this.sal +" et votre carte est " + this.cni);
		};
		

	public static void main(String[] args) {


	}

}
