package FORME;
import java.util.Scanner;
public class cercle extends forme{
		private double ra;
	public cercle() {
		this.ra=0.0;
	};
	public cercle(double ra) {
		this.ra=ra;
	};
	public double getRa() {
		return ra;
	};
	public void setRa(double ra) {
		this.ra=ra;
	};
	protected void recu() {
		double co;
		double r,p;
		Scanner s = new Scanner(System.in);
		System.out.println("entrer le cote : ");
		co = s.nextDouble();
		r = pericer(co);
		p = surce(co);
		System.out.println("le perimetre du cercle "+r+" et la surface est "+p);
	}
}
