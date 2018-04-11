package jus.aoo.elcaro;

import java.util.ArrayList;
import java.util.Iterator;

public class Projection extends StateLessUnaire {

	ArrayList<_Attribut> attributsVoulus = new ArrayList<>();
	public Projection(Relation mere, ArrayList<_Attribut> a) {
		super("projection("+mere.getNom()+")", mere.getSchema(), mere);
		this.attributsVoulus=a;
	}

	@Override
	public Iterator<_Tuple> iterator() {
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
				for(int i = 0; i < attributsVoulus.size(); i++){
					// tant qu'il y a une suivant, et que l'indice courant des attributs souhaités est trouvé dans le schema
					while(it.hasNext() && !(b=(schema.getIndexAttribut(attributsVoulus.get(i).getName()) != -1)));
				}
				return b;
			}
		};
	}
}
