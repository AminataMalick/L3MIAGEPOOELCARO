package relations;

import java.util.Iterator;

import interfaces._Predicat;
import interfaces._Tuple;

public class Selection extends StateLessUnaire {
	_Predicat p;
	public Selection(Relation mere, _Predicat p) {
		super("selection("+mere.getNom()+")", mere.getSchema(), mere);
		this.p=p;
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
				while(it.hasNext() && !(b=p.eval(next=it.next())));
				return b;
			}
		};
	}
	
	@Override
	public String toString(){
		String res = "Table : " + getNom() + "\n";
		res += this.getSchema().toString() + "\n";
		for(_Tuple t : this){
			for(Object o : t){
				res += o.toString() + " ";
			}
			res += "\n";
		}
		return res;
	}
}
