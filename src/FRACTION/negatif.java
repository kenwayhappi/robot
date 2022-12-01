package FRACTION;

public class negatif extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public negatif() {
		super("Attention denominateur doit etre positif");
	}
	public void show() {
		System.out.println("denominateur doit etre different de ZERO");
	}
}