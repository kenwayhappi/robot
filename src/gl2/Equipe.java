package gl2;
import java.util.Scanner;
import gl2.Employer;
public class Equipe{
	public static void main(String []args) {
		Employer [] e = new Employer[4];
	for(int i = 0 ; i<4 ; i++ ) {
		Scanner s = new Scanner(System.in);
		System.out.println("employer"+(i+1));
		System.out.println("entrer votre nom : ");
		e[i] = new Employer();
		e[i].setN(s.nextLine());
		System.out.println("entrer votre prenom : ");
		e[i].setP(s.nextLine());
		System.out.println("entrer votre salaire : ");
		e[i].setSal(s.nextDouble());
		System.out.println("entrer votre CNI: ");
		e[i].setCni(s.nextInt());
	}
	for(int i = 0 ; i<4 ; i++ ) {
		e[i].affiche();
	}
}
}
