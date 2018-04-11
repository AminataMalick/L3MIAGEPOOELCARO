package jus.aoo.elcaro;


public abstract class StateLessUnaire extends StateLess {
	protected Relation r;
	/**
	 * Représentation d'une relation StateLessUnaire
	 *  Affection du nom et du schema de la relation à l'aide du constructeur de la classe mere
	 * @param nom
	 * @param schema
	 * @param mere
	 */
	protected StateLessUnaire(String nom, Schema schema, Relation mere) {
		super(nom, schema);
		this.r=mere;
	}
}
