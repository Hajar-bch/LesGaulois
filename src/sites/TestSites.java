package sites;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Romain;
import personnages.Soldat;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Soldat minus = new Soldat("Minus", 2, Grade.TESSERARIUS);

		Village village = new Village(vercingetorix);
		Camp camp = new Camp(minus);

	}

}
