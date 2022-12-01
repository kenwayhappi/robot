  package devoir2;
import java.util.Scanner;
public class Mathieux {
	static int fact(int n) {
		if(n==0) return 1;
		else return(n* fact(n-1));
	}
	static int basedeux(int n) {
		int b=0,c,d=1;
		while(n!=0) {
		c = n % 10;
		b = b + c*d;
		d = d * 2;
		n = n / 10;
	}
		return b;
	}
	static int basedix(int n) {
		int b=0,c,d=1;
		while(n!=0) {
		c = n % 10;
		b = b - c/d;
		d = d / 2;
		n = n * 10;
	}
		return b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,f=1,n,c=0;
		System.out.println("quel operation voulez vous faire ? \n 1 = factoriel \n 2 = convertion base 10 en 2 \n 3 = convertir base 2 en 10  ");
		c = s.nextInt();
		if(c==1) {
			System.out.println("quel nombre voulez vous faire le factoriel ? ");
			n = s.nextInt();
			f=fact(n);
			System.out.println("factoriel de "+n+" est "+f);
		}else if(c==2) {
			System.out.println("quel nombre voulez vous convertir en base 10 ? ");
			n = s.nextInt();
			f=basedix(n);
			System.out.println("Le nombre "+n+" en base 2 est "+f);
		}else if(c==3) {
			System.out.println("quel nombre voulez convertit en base 2? ");
			n = s.nextInt();
			f=basedeux(n);
			System.out.println("Le nombre "+n+" en base 10 est "+f);
		}else {
			System.out.println("Entrer un nombre entre 1 et 3 ");
		}
	}

}
