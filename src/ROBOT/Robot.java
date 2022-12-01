package ROBOT;
import java.util.Scanner;
public class Robot {
	protected String nom;
	protected double pv;
	
	public Robot() {}
	
	public Robot(String nom , double pv) {
		this.nom=nom;
		this.pv=pv;
	}
	public void fire(int fire) {
		this.pv -= fire;
		System.out.println(" il a perdu "+fire+ " point de vie");
	}
	
	public void fighter(Robot r) {
		int c;
	    	System.out.print("\n quel robot attaque ? 1 ou 2 : ");
	    	Scanner s = new Scanner(System.in);
		    c = s.nextInt();
		    if(c==1) {
		    	System.out.print("\n"+r.getNom()+" attaque "+this.getNom() );
		    	this.fire(2);
		    	System.out.println("\n"+this.getNom()+" il vous reste "+this.getPv());
		    	while(r.getPv()!=2 && this.getPv()!=0) {
		    	System.out.print("\n"+this.getNom()+" contre attaque "+r.getNom());
		    	r.fire(2);
		    	System.out.println("\n"+r.getNom()+" il vous reste "+r.getPv());
		    	System.out.print("\n"+r.getNom()+" attaque "+this.getNom() );
		    	this.fire(2);
		    	System.out.println("\n"+this.getNom()+" il vous reste "+this.getPv());
		    	}
		    }else if(c==2){
		    	System.out.print("\n"+this.getNom()+" attaque "+r.getNom() );
		    	r.fire(2);
		    	System.out.println("\n"+r.getNom()+" il vous reste "+r.getPv());
		    	while(this.getPv()!=2 && r.getPv()!=0) {
		    	System.out.print("\n"+this.getNom()+" contre attaque "+r.getNom());
		    	this.fire(2);
		    	System.out.println("\n"+this.getNom()+" il vous reste "+this.getPv());
		    	System.out.print("\n"+this.getNom()+" attaque "+r.getNom() );
		    	r.fire(2);
		    	System.out.println("\n"+r.getNom()+" il vous reste "+r.getPv());
		    	}
		    }
	    }
	
	
	public void isDead(Robot r) {
		if(r.getPv()==0) System.out.print(r.getNom()+" vous etez mort");
		else if(this.getPv()==0) System.out.print(this.getNom()+" vous etez mort"); 
		else System.out.print(" personne n'est mort"); 
	}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPv() {
        return pv;
    }

    public void setPv(double pv) {
        this.pv = pv;
    }
}

