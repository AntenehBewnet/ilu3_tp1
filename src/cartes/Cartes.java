package cartes;

public abstract class Cartes {
	private Type type;
	
	public Cartes(Type type) {
		this.type = type;
	}

	public abstract String toString();
}
