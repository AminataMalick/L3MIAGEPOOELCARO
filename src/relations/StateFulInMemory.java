package relations;

import java.util.HashMap;
import java.util.Iterator;

import interfaces._Tuple;

public class StateFulInMemory extends StateFull {
	/**
	 * Représentation des clés d'une relation statefull
	 */
	private HashMap<Object, _Tuple> tuples;
	
	
	/**
	 * Représentation des tuples d'une relation statefull
	 * Affection du nom et du schema de la relation à l'aide du constructeur de la classe mere
	 * @param nom
	 * @param schema
	 */
	public StateFulInMemory(String nom, Schema schema) {
		super(nom, schema);
		tuples = new HashMap<>();
	}

	/**
	 * Renvoie la valeur du tuple courant
	 * @return tuples.values().iterator()
	 */
	@Override public Iterator<_Tuple> iterator() {
		return tuples.values().iterator();
	}

	/**
	 * Ajout d'un tuple dans la relation (avec le premier élément comme clé)
	 * @param tuple
	 */
	@Override public void add(_Tuple tuple) {
		
		tuples.put(tuple.get(0), tuple);	
	}

	/**
	 * Suppression du tuple d'indice index
	 * @param index
	 */
	@Override public void remove(int index) {
		tuples.remove(index);	
	}
}
 

