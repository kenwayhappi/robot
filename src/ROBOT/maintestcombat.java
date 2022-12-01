package ROBOT;

import java.util.Scanner;

public class maintestcombat {

	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			int c;
			
			Robot D2R2 = new Robot("paul",10);
		    System.out.print(D2R2.getNom()+" vous avez "+D2R2.getPv()+" point de vie \n");
		    
		    Robot Data = new Robot("jean",10);
		    System.out.print(Data.getNom()+" vous avez "+Data.getPv()+" point de vie ");
		    Data.fighter(D2R2);
		    System.out.print(Data.getNom()+" vous avez "+Data.getPv()+" point de vie ");
		    System.out.println("");
		    D2R2.isDead(Data);


	}

}
