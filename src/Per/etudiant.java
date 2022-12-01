package Per;
import java.util.Scanner;
 public class etudiant extends personne{
	 public etudiant() {super();}
	public void recu() {
		String n,p;
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("entrer votre nom : ");
		n = s.nextLine();
		System.out.println("entrer votre prenom : ");
		p = s.nextLine();
		System.out.println("entrer votre age : ");
		a = s.nextInt();
	}
}
