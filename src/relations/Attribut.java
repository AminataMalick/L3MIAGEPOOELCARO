package relations;

import interfaces._Attribut;
import types.Type;

public class Attribut implements _Attribut {
	private final String nom;
	private final Type type;
	public Attribut(String nom, Type type) { this.nom=nom; this.type=type;}
	@Override
	public String getName() {return nom;}
	@Override
	public String toString(){
		return getName();
	}
}
