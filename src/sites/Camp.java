package sites;

import personnages.Grade;
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

	public void ajouterSoldat(Soldat soldat) {
		if (nbSoldats < soldats.length) {
			soldats[nbSoldats] = soldat;
			nbSoldats++;
			soldat.parler(
					": « Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom() + " »");

		} else {
			commandant.parler("Le romain Minus : « Désolé " + soldat.getNom() + " notre camp est complet ! ».");
		}

	}

	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats : ");
		for (int i = 0; i < nbSoldats; i++) {
			System.out.println("-" + soldats[i].getNom());

		}
	}

	public void changerCommandant(Soldat nouveauCom) {
		if (nouveauCom.getGrade() == Grade.CENTURION) {
			this.commandant = nouveauCom;
			nouveauCom.parler("Moi " + nouveauCom.getNom() + " je prends la direction du camp romain");
		} else {
			nouveauCom.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
		}
	}

}
