package relations;

import interfaces._Tuple;

public abstract class Relation implements Iterable<_Tuple> {
	private final String nom;
	protected final Schema schema;
	
	/**
	 * @param nom 
	 * Recupération du nom de la relation
	 * @return nom 
	 */
	public String getNom() {return nom;}
	
	/**
	 * @param schema 
	 * Recupération du schema de la relation
	 * @return schema
	 */
	public Schema getSchema() {return schema;}
	
	/**
	 * Constructeur de relation
	 * @param nom 
	 * @param schema
	 * @return res
	 */
	protected Relation(String nom, Schema schema){ this.nom=nom; this.schema= schema;}
	
	/**
	 * Transformation du nom de la table et du schéma en string
	 * @return res
	 */
	public @Override String toString(){
		String res = "Table : " + getNom() + "\n";
		res += getSchema().toString() + "\n";
		return res;
	}
}
