package jus.aoo.elcaro;

import java.util.ArrayList;
import java.util.Iterator;

public class Projection extends StateLessUnaire {

	Attribut[] a;
	public Projection(Relation mere, Attribut[] a) {
		super("projection("+mere.getNom()+")", mere.getSchema(), mere);
		this.a=a;
	}

	@Override public Iterator<_Tuple> iterator() {
		return new Iterator<_Tuple>() {
			Iterator<_Tuple> it = r.iterator();
			boolean hasNext=getNext();
			_Tuple next;
			@Override public boolean hasNext() {return hasNext;}
			@Override public _Tuple next() {
				_Tuple temp = next;
				hasNext = getNext();
				return temp;
			}
			private boolean getNext() {
				if(!it.hasNext()) return false;
				boolean b=false;
				while(it.hasNext() && !(b=a.equals(next=it.next())));
				return b;
			}
		};
	}
}
