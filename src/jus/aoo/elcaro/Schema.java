package jus.aoo.elcaro;

import java.util.Iterator;

public class Schema implements Iterable<_Attribut>{
	private final _Attribut[] attributs;
	public Schema(_Attribut... attributs){ this.attributs=attributs;}
	@Override
	public Iterator<_Attribut> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<_Attribut>(){
			private int index = 0;
			@Override public boolean hasNext() {
				return index<attributs.length;
			}
			@Override public _Attribut next() {
				return attributs[index++];
			}};
	}
	
}
