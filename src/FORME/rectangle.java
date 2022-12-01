package FORME;
import java.util.Scanner;
public class rectangle extends forme{
		protected double lo,la;
	public rectangle() {
		this.lo=0.0;
		this.la=0.0;
	};
	public rectangle(double lo, double la) {
		this.lo=lo;
		this.la=la;
	};
	public double getLo() {
		return lo;
	};
	public void setLo(double lo) {
		this.lo=lo;
	};
	public double getLa() {
		return la;
	};
	public void setLa(double lo) {
		this.la=la;
	};
	protected void recu() {
		double lo,la;
		double r,p;
		Scanner s = new Scanner(System.in);
		System.out.println("entrer la longeur : ");
		lo = s.nextDouble();
		System.out.println("entrer la largeur : ");
		la = s.nextDouble();
		r = perip(lo,la);
		p = surr(lo,la);
		System.out.println("le perimetre du rectangle "+r+" et la surface est "+p);
	}
}
