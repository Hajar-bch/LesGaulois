package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[3];
	private int nbSoldats = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain");
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public void ajouterSoldat(Soldat soldats) {
		if (nbSoldats < soldats.lenght) {
			soldats[nbSoldats] = soldats;
			nbSoldats++;
			System.out.println(doneerAuteur() + soldats.getNom()
					+ ": « Je mets mon épée au service de Rome dans le camp dirigé par Minus »");

		} else {
			System.out.println(donnerAuteur() + "Minus : « Désolé" + soldats.getNom() + " notre camp est complet ! ».");
		}

	}

	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + commandant.getNom() + "contient les soldats : ");
		for (int i = 0; i < nbSoldats; i++) {
			System.out.println("-" + soldats[i].getNom());

		}
	}
	
	public void changerCommandant() {
		if (Soldat.Grade = "CENTURION") {
			System.out.println
		}
	}

}
