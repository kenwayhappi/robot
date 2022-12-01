package Per;

public class personne {
	protected String nom,prenom;
	protected int age;
	
	public personne() {
		this.nom="";
		this.prenom="";
		this.age=0;
	}
	public personne(String nom, String prenom, int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void show() {
		System.out.println("bonjour "+getNom()+" "+getPrenom()+" vous avez "+getAge()+" ans");
	}
}
