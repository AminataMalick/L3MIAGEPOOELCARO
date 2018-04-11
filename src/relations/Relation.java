package relations;

import interfaces._Tuple;

public abstract class Relation implements Iterable<_Tuple> {
	private final String nom;
	protected final Schema schema;
	public String getNom() {return nom;}
	public Schema getSchema() {return schema;}
	protected Relation(String nom, Schema schema){ this.nom=nom; this.schema= schema;}
	public @Override String toString(){
		String res = "Table : " + getNom() + "\n";
		res += getSchema().toString() + "\n";
		return res;
	}
}
