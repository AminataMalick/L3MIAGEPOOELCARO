package jus.aoo.elcaro;

import java.util.ArrayList;
import java.util.Iterator;

public class StateFulInMemory extends StateFull {
	private ArrayList<_Tuple> tuples;
	public StateFulInMemory(String nom, Schema schema) {
		super(nom, schema);
		tuples = new ArrayList<>();
	}

	@Override public Iterator<_Tuple> iterator() {
		return new Iterator<_Tuple>(){
			private int index = 0;
			@Override public boolean hasNext() {
				return index<tuples.size();
			}
			@Override public _Tuple next() {
				return tuples.get(index++);
			}
		};
	}

	@Override public void add(_Tuple tuple) {
		tuples.add(tuple);	
	}

	@Override public void remove(int index, _Tuple tuple) {
		tuples.remove(index);		
	}
}
