package relations;

import interfaces._Tuple;

public abstract class StateFull extends Relation {

	protected StateFull(String nom, Schema schema) {super(nom, schema);}

	public abstract void add(_Tuple tuple);
	public abstract void remove(int index);
}
