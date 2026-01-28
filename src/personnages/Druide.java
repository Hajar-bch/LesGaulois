package personnages;

import java.security.SecureRandom;

public class Druide extends Gaulois {
	private Random random;

	try
	{
		random = SecureRandom.getInstanceStrong();
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}

	public Druide(String nom, int force) {
		super(nom, force);
	}

	public void fabriquerPotion() {
		int puissPotion = 
	}

}
