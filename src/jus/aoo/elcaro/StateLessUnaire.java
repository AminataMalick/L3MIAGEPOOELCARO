package jus.aoo.elcaro;


public abstract class StateLessUnaire extends StateLess {
	protected Relation r;
	protected StateLessUnaire(String nom, Schema schema, Relation mere) {
		super(nom, schema);
		this.r=mere;
	}
}
