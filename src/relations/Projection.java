package relations;

import java.util.ArrayList;
import java.util.Iterator;

import interfaces._Attribut;
import interfaces._Tuple;

public class Projection extends StateLessUnaire {

	private final int[] indexesAttributsVoulus;
	private final Schema sch;
	
	public Projection(Relation mere, Schema sch) {
		super("projection("+mere.getNom()+")", mere.getSchema(), mere);
		_Attribut a;
		indexesAttributsVoulus = new int[sch.getLength()];
		for(int i = 0 ; i < indexesAttributsVoulus.length ; i++){
			a = sch.getAttribut(i);
			indexesAttributsVoulus[i] = mere.getSchema().getIndexAttribut(a);
		}
		this.sch = sch;
	}

	@Override
	public Iterator<_Tuple> iterator() {
		return new Iterator<_Tuple>() {
			Iterator<_Tuple> it = r.iterator();
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public _Tuple next() {
				_Tuple t= it.next();
				Object[] temp = new Object[indexesAttributsVoulus.length];
				for(int i = 0 ; i < indexesAttributsVoulus.length ; i++){temp[i] = t.get(indexesAttributsVoulus[i]);}
				return new Tuple(temp);
			}
		};
	}
	
	@Override
	public String toString(){
		String res = "Table : " + getNom() + "\n";
		res += sch.toString() + "\n";
		for(_Tuple t : this){
			for(Object o : t){
				res += o.toString() + " ";
			}
			res += "\n";
		}
		return res;
	}
}