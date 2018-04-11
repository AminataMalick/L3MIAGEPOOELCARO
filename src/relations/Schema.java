package relations;

import java.util.Iterator;

import interfaces._Attribut;

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
	public int getIndexAttribut(_Attribut a){
		for(int i=0 ; i<attributs.length ; i++){if(attributs[i].getName().equals(a.getName()))return i;}
		return -1;
	}
	public _Attribut getAttribut(int i){
		return 	attributs[i];
	}
	
	public int getLength(){
		return attributs.length;
	}
	
	@Override
	public String toString(){
		String res = "";
		for(int i =0 ; i<attributs.length; i++){
			res += attributs[i].toString() + " ";
		}
		return res;
	}
}