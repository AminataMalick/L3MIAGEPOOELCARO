package jus.aoo.elcaro;

import java.util.Iterator;

public class Tuple implements _Tuple {
	private final Object[] ligne;
	public Tuple(Object... ligne) {this.ligne=ligne;}
	public Object get(int index){return ligne[index];}
	@Override
	public Iterator<Object> iterator() {
		return new Iterator<Object>() {
			private int index = 0;
			@Override public boolean hasNext() {
				return index<ligne.length;
			}
			@Override public Object next() {
				return ligne[index++];
			}
		};
	}
	@Override
	public String toString(){
		String res = "";
		for(int i = 0; i < ligne.length; i++){
			res += ligne[i] + " ";
		}
		return res;
	}
}
