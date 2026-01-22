package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats= new Soldat[80];
	private int nbSoldats = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain");
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public void ajouterSoldat() {

	}

}
