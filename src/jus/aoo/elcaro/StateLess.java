package jus.aoo.elcaro;

import java.util.Iterator;

public abstract class StateLess extends Relation{

	/**
	 * Représentation d'une relation StateLess
	 * Affection du nom et du schema de la relation à l'aide du constructeur de la classe mere
	 * @param nom
	 * @param schema
	 */
	protected StateLess(String nom, Schema schema) {super(nom, schema);}


}
