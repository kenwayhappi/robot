package ROBOT;
import java.util.Scanner;

public class Arena extends Robot{	
		Robot r1,r2;
		
		public Arena() {}
		public Arena(Robot a, Robot b) {
			this.r1 = a;
			this.r2 = b;
		}
		public void fighter(Robot r) {
			int c;
		    	System.out.print("\n quel robot attaque ? 1 ou 2 : ");
		    	Scanner s = new Scanner(System.in);
			    c = s.nextInt();
			    if(c==1) {
			    	System.out.print("\n"+r1.getNom()+" attaque "+r2.getNom() );
			    	r2.fire(2);
			    	System.out.println("\n"+r2.getNom()+" il vous reste "+r2.getPv());
			    	while(r1.getPv()!=2 && r2.getPv()!=0) {
			    	System.out.print("\n"+r2.getNom()+" contre attaque "+r1.getNom());
			    	r1.fire(2);
			    	System.out.println("\n"+r1.getNom()+" il vous reste "+r1.getPv());
			    	System.out.print("\n"+r1.getNom()+" attaque "+r2.getNom() );
			    	r2.fire(2);
			    	System.out.println("\n"+this.getNom()+" il vous reste "+this.getPv());
			    	}
			    }else if(c==2){
			    	System.out.print("\n"+r2.getNom()+" attaque "+r1.getNom() );
			    	r1.fire(2);
			    	System.out.println("\n"+r1.getNom()+" il vous reste "+r1.getPv());
			    	while(r2.getPv()!=2 && r1.getPv()!=0) {
			    	System.out.print("\n"+this.getNom()+" contre attaque "+r1.getNom());
			    	r2.fire(2);
			    	System.out.println("\n"+r2.getNom()+" il vous reste "+r2.getPv());
			    	System.out.print("\n"+r2.getNom()+" attaque "+r1.getNom() );
			    	r1.fire(2);
			    	System.out.println("\n"+r1.getNom()+" il vous reste "+r1.getPv());
			    	}
			    }
		    }
		public Arena(String nom, double pv) {
			super(nom, pv);
			// TODO Auto-generated constructor stub
		}
	
}
