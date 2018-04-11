package jus.aoo.elcaro;

import java.util.Iterator;

public class Tuple implements _Tuple {
	private final Object[] ligne;
	/**
	 * Affectation du parametre ligne
	 * @param ligne le tuple courant
	 * @return ligne
	 */
	public Tuple(Object... ligne) {this.ligne=ligne;}
	
	/**
	 * Recuperation dans le tuple de l'object d'indice index 
	 * @param index l'indice dans le tuple
	 * @return ligne[index]
	 */
	public Object get(int index){return ligne[index];}
	
	/**
	 * Mise en place de l'iterateur d'objets
	 */
	@Override
	public Iterator<Object> iterator() {
		return new Iterator<Object>() {
			private int index = 0;
			/**
			 * Recuperature du boolean de controle d'indice-> vrai si index<ligne.length
			 * return index<ligne.length
			 */
			@Override public boolean hasNext() {
				return index<ligne.length;
			}
			
			/**
			 * Recuperation de l'objet suivant du tuple  
			 * @return ligne[index++]
			 */
			@Override public Object next() {
				return ligne[index++];
			}
		};
	}
	
	/**
	 * 
	 * Transformation des objets du tuples en string
	 * @return res
	 *
	 */
	@Override
	public String toString(){
		String res = "";
		for(int i = 0; i < ligne.length; i++){
			res += ligne[i] + " ";
		}
		return res;
	}
}
