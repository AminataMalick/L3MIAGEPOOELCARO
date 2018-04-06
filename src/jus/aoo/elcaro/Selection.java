package jus.aoo.elcaro;

import java.util.Iterator;

public class Selection extends StateLessUnaire {
	_Predicat p;
	public Selection(Relation mere, _Predicat p) {
		super("selection("+mere.getNom()+")", mere.getSchema(), mere);
		this.p=p;
	}

	@Override public Iterator<_Tuple> iterator() {
		// TODO Auto-generated method stub
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
				while(it.hasNext() && !(b=p.eval(next=it.next())));
				return b;
			}
		};
	}

}
