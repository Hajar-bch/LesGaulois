package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}

	public String getNom() {
		return nom;

	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		int forceDuCoup = force/3;
		romain.recevoirCoup(forceDuCoup);
	}
	
	//main C
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour à tous");
	}
	
	public void parler(String texte) {
		System.out.println("Le gaulois " + nom + ": «" + texte + "»");

	}
}
