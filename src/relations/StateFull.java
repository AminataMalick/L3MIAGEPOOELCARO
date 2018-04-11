package relations;

import interfaces._Tuple;

public abstract class StateFull extends Relation {

	/**
	 * Représentation d'une relation StateFull
	 *  Affection du nom et du schéma de la relation à l'aide du constructeur de la classe mère
	 * @param nom
	 * @param schema
	 */
	protected StateFull(String nom, Schema schema) {super(nom, schema);}

	/**
	 * Ajout d'un tuple dans la relation
	 * @param tuple
	 */
	public abstract void add(_Tuple tuple);
	
	/**
	 * Suppression d'un tuple à l'aide de son indice index
	 * @param index
	 */
	public abstract void remove(int index);
}
