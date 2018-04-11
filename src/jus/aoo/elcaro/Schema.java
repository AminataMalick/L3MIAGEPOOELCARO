package jus.aoo.elcaro;

import java.util.Iterator;

public class Schema implements Iterable<_Attribut>{
	private final _Attribut[] attributs;
	public Schema(_Attribut... attributs){ this.attributs=attributs;}
	@Override
	public Iterator<_Attribut> iterator() {
		return new Iterator<_Attribut>(){
			private int index = 0;
			@Override public boolean hasNext() {
				return index<attributs.length;
			}
			@Override public _Attribut next() {
				return attributs[index++];
			}};
	}
	public int getIndexAttribut(String name){
		for(int i=0 ; i<attributs.length ; i++){if(attributs[i].getName().equals(name))return i;}
		return -1;
	}
}
