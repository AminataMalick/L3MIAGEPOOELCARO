package relations;

import java.util.Iterator;

import interfaces._Predicat;
import interfaces._Tuple;

/**
 * Gestion de la selection
 * @author baa
 *
 */
public class Selection extends StateLessUnaire {
	_Predicat p;
	
	/**
	 * Affectation du predicat p à la relation mere
	 * @param mere
	 * @param p
	 */
	public Selection(Relation mere, _Predicat p) {
		super("selection("+mere.getNom()+")", mere.getSchema(), mere);
		this.p=p;
	}

	/**
	 * Mise en place de l'itérateur de tuples
	 * @return Iterateur<Tuple>
	 */
	@Override public Iterator<_Tuple> iterator() {
		return new Iterator<_Tuple>() {
			Iterator<_Tuple> it = r.iterator();
			boolean hasNext=getNext();
			_Tuple next;
			
			/**
			 * Retourne vrai si le tuple courant n'est pas le dernier de la relation
			 * @return hasNext
			 */
			@Override public boolean hasNext() {return hasNext;}
			
			
			/**
			 * Renvoie un tuple satisfaisant l'evaluation  
			 * @return temp
			 */
			@Override public _Tuple next() {
				_Tuple temp = next;
				hasNext = getNext();
				return temp;
			}
			
			/**
			 * Retourne vrai si pendant le parcours des tuples le tuple courant satisfait l'evaluation  
			 * @return b
			 */
			private boolean getNext() {
				if(!it.hasNext()) return false;
				boolean b=false;
				while(it.hasNext() && !(b=p.eval(next=it.next())));
				return b;
			}
		};
	}
	
	/**
	 * Transformation du nom de la relation et du schema de la relation en string
	 * @return res
	 */
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
