package FORME;
import java.util.Scanner;
public class carre extends rectangle{
		private double co;
	public carre() {
		this.co=0.0;
	};
	public carre(double co) {
		this.co=co;
	};
	public double getCo() {
		return co;
	};
	public void setCo(double co) {
		this.co=co;
	};
	protected void recu() {
		double co;
		double r,p;
		Scanner s = new Scanner(System.in);
		System.out.println("entrer le cote : ");
		co = s.nextDouble();
		r = peric(co);
		p = surc(co);
		System.out.println("le perimetre du carre  est "+r+" et la surface est "+p);
	}
}
