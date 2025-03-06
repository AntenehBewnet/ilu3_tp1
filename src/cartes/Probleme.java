package cartes;

public abstract class Probleme extends Cartes {
	
	private Type type;
	
	public Probleme(Type type) {
		super(type);
	}
	
	
	public Type getType() {
		return type;
	}

}