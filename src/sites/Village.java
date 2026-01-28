package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[4];
	private int nbVillageois = 0;

	public Village(Gaulois chef) {
		this.chef = chef;
		chef.parler("Je suis un grand guerrier et je vais créer mon village");
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			chef.parler(" : « Bienvenue " + gaulois.getNom() + " ! ».");

		} else {
			chef.parler(" « Désolé "+ gaulois.getNom()+ " mon village est déjà bien rempli. »");
		}

	}

	public void afficherVillageois() {
		System.out.println("Le village de " + chef.getNom() + "est habité par :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("-" + villageois[i].getNom());
		}
	}

	public void changerChef(Gaulois nouveauChef) {
		this.chef.parler("Je laisse mon grand bouclier au grand " + nouveauChef.getNom());
		this.chef = nouveauChef;
		this.chef.parler("Merci !");

	}

}
