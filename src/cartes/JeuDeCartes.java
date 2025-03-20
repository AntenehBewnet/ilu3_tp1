package cartes;

import java.util.Iterator;

public class JeuDeCartes {
	
	private static Configuration[] typesDeCartes = {new Configuration(new Borne(25), 10),
			new Configuration(new Borne(50), 10),
			new Configuration(new Borne(75), 10),
			new Configuration(new Borne(100), 10),
			new Configuration(new Borne(200), 10),
			new Configuration(new Parade(Type.FEU), 14),
			new Configuration(new Parade(Type.FEU), 6),
			new Configuration(new Parade(Type.ESSENCE), 6),
			new Configuration(new Parade(Type.ACCIDENT), 6),
			new Configuration(new Parade(Type.ACCIDENT), 6),
			new Configuration(new Attaque(Type.FEU), 5),
			new Configuration(new Attaque(Type.FEU), 4),
			new Configuration(new Attaque(Type.ESSENCE), 3),
			new Configuration(new Attaque(Type.CREVAISON), 3),
			new Configuration(new Attaque(Type.ACCIDENT), 3),
			new Configuration(new Botte(Type.FEU), 1),
			new Configuration(new Botte(Type.ESSENCE), 1),
			new Configuration(new Botte(Type.CREVAISON), 1),
			new Configuration(new Botte(Type.ACCIDENT), 1)
			
	};

	public JeuDeCartes() {
		
	}
	
	
	public String affichageDuJeu() {
		StringBuilder sb = new StringBuilder("JEU");
		for (Configuration configuration : typesDeCartes) {
			String nbr = String.valueOf(configuration.getNbExemplaires());
			String type = configuration.getCarte().toString();
			sb.append(nbr + type + "\n");
			
		}
		
		return sb.toString();
	}

	
	
	private static class Configuration{
		
		private int nbExemplaires;
		private Carte carte;
		
		
		public Configuration(Carte carte,int nbExemplaires) {
			this.nbExemplaires = nbExemplaires;
			this.carte = carte;
		}
		
		public Carte getCarte() {
			return carte;
		}
		
		public int getNbExemplaires() {
			return nbExemplaires;
		}
	}
}








