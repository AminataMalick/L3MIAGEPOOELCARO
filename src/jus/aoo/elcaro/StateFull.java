package jus.aoo.elcaro;

public abstract class StateFull extends Relation {

	protected StateFull(String nom, Schema schema) {super(nom, schema);}

	public abstract void add(_Tuple tuple);
	public abstract void remove(int index, _Tuple tuple);
}
