package cartes;

public enum Type {
	FEU("feu rouge","feu vert","vehicule prioritaire");
	//,ESSENCE,CREVAISON,ACCIDENT
	//,

    private final String attaque;
    private final String parade;
    private final String botte;

    Type(String attaque, String parade, String botte) {
        this.attaque = attaque;
        this.parade = parade;
        this.botte = botte;
    }
}
