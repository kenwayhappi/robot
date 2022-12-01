package FORME;
import java.util.Scanner;
public class Mainforme {

	public static void main(String[] args) {
		rectangle r = new rectangle();
		carre c =  new carre();
		cercle ce = new cercle();
		Scanner s = new Scanner(System.in);
		int ch=4;
		while(ch>3 || ch<1) {
			System.out.println("avez qui voulez vous travailler \n 1 = rectangle \n 2 = carre \n 3 = cercle");
			ch = s.nextInt();
			if(ch==1) r.recu();
			else if(ch==2) c.recu();
			else if(ch==3) ce.recu();
			else System.out.println("entrer un nombre entre [1-3]");
		}
	}

}
