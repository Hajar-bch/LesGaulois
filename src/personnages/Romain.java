package personnages;

public class Romain {

	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus.getNom());
		minus.parler("UN GAU… UN GAUGAU…");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println("Le romain " + nom + ": «" + texte + "»");

	}
	public void recevoirCoup(int forceCoup) {
		this.force = this.force - forceCoup;
		if(this.force<0) {
			this.force=0;
		}
		if (this.force>0) {
			System.out.println("Le romain " + nom + ": « Aïe ! »");
		}
			
		else {
			System.out.println("J'abandonne...");
		}
		
	}
}
