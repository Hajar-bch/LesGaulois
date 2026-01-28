package sites;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Romain;
import personnages.Soldat;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Gaulois asterix = new Gaulois("Asterix", 5);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);

		Soldat minus = new Soldat("Minus", 2, Grade.TESSERARIUS);
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("TulliusOctopus", 2, Grade.TESSERARIUS);
		Soldat ballondeBaudrus = new Soldat("BallondeBaudrus", 3, Grade.OPTIO);
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);

		Village village = new Village(vercingetorix);
		Camp camp = new Camp(minus);

		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);

		village.changerChef(abraracourcix);

		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(minus);

		camp.changerCommandant(chorus);

		village.afficherVillageois();
		camp.afficherCamp();

	}

}
