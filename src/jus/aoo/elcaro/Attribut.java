package jus.aoo.elcaro;

public class Attribut implements _Attribut {
	private final String nom;
	private final Type type;
	
	/**
	 * Affectation du nom et du type de l'attribut
	 * @param nom
	 * @param type
	 * @return nom
	 * @return type
	 */
	public Attribut(String nom, Type type) { this.nom=nom; this.type=type;}
	
	/**
	 * @return
	 */
	@Override
	public String getName() {return nom;}
	@Override
	public String toString(){
		return getName();
	}
}
