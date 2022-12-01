package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EntNat {
	protected int nbr;
	
	public EntNat() {
		this.nbr=0;
	}
	public EntNat(int nbr) {
		this.nbr=nbr;
	}
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr=nbr;
	}
	public static void main(String[] args) throws errConst {
			EntNat n = new EntNat();
			n= new EntNat();
			System.out.print("entrer un nombre entier naturel : ");
			try {
				Scanner s = new Scanner(System.in);
				n.setNbr(s.nextInt());
			}catch (InputMismatchException e) {
				System.out.println("entrer un nombre");
				Scanner s = new Scanner(System.in);
				System.out.print("entrer un nombre entier naturel : ");
				n.setNbr(s.nextInt());
			}
		if(n.getNbr()<0) {
			throw new errConst();
		}
		System.out.print(n.getNbr()+" est-un nombre entier naturel");
	}
}
