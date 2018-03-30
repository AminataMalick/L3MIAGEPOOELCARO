package jus.aoo.elcaro;

public abstract class Relation implements Iterable<_Tuple> {
	private final String nom;
	private final Schema schema;
	public String getNom() {return nom;}
	public Schema getSchema() {return schema;}
	protected Relation(String nom, Schema schema){ this.nom=nom; this.schema= schema;}
	
}
