package jus.aoo.elcaro;

import java.util.HashMap;
import java.util.Iterator;

public class StateFulInMemory extends StateFull {
	/**
	 * Représentation des tuples d'une relation statefull
	 */
	
	/**
	 * Représentation des clés d'une relation statefull
	 */
	private HashMap<Object, _Tuple> tuples;
	
	public StateFulInMemory(String nom, Schema schema) {
		super(nom, schema);
		tuples = new HashMap<>();
	}

	@Override public Iterator<_Tuple> iterator() {
		return tuples.values().iterator();
	}

	@Override public void add(_Tuple tuple) {
		
		tuples.put(tuple.get(0), tuple);	
	}

	@Override public void remove(int index) {
		tuples.remove(index);		
	}
}
 

