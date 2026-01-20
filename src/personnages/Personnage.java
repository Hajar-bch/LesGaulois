package personnages;

public abstract class Personnage {
	
	private String nom;
	private int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(donnerAuteur() + nom + ": «" + texte + "»");

	}
	
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage personnage) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + personnage.getNom());
		int forceCoup = force / 3;
		personnage.recevoirCoup(forceCoup);
	}
	
	public void recevoirCoup(int forceCoup) {
		this.force = this.force - forceCoup;
		if (this.force < 1) {
			this.force = 0;
			parler("J'abandonne!");
		} else {
			parler("Aïe !");
		}

	}

}
