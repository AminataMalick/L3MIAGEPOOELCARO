package jus.aoo.elcaro;

public interface _Relation implements Iterable<Tuple> {

	abstract class XRelation implements _Relation { … }
	
	class XstateFullRelation extends Xrelation {
		public void add(_Tuple t);
	}
	
	class StateFullinMemoryRelation extends XstateFullRelation {
		private ArrayList<_Tuple> tuples ;
	}
}
