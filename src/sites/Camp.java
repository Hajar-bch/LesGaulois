package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain");
	}

}
