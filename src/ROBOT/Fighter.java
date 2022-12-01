package ROBOT;
import java.util.Scanner;
java.util.Random;
public class Fighter {
	private String nom;
	private double pv;
	private boolean seed;
	
	public Fighter() {
		this.nom="";
		this.pv=1.0;
		this.seed=true;
	}
	public Fighter(String nom , double pv, boolean seed) {
		this.nom=nom;
		this.pv=pv;
		this.seed=seed;
	}
	public String getNom() {
		return nom;
	}
	public double getPv() {
		return pv;
	}
	public boolean getSeed() {
		return seed;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPv(int pv) {
		this.pv=pv;
	}
	public void setSeed(boolean seed) {
		this.seed=seed;
	}
	 Robot fit(Robot r) {
		if(nextBoolean() == true) {
			r.pv = r.pv;
			System.out.print(r.nom+" a ete rate par"+this.getNom()+" sa vie est de : "+r.pv );
		}else if(nextBoolean() == false) {
			r.fire(2);
			System.out.print(r.nom+" a ete toucher par"+this.getNom()+" sa vie est de : "+r.pv );
		}
	}
	private boolean nextBoolean() {
		Random rand = new Random();
		seed = rand.nextBoolean();
		return seed;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Fighter a = new Fighter("paul", 10);
		Fighter b = new Fighter("jean", 10);
		
		a.fit(b);
		b.fit(a);
	}
}
