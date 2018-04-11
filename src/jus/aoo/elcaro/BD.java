package jus.aoo.elcaro;

import relations.Relation;

public abstract class BD implements Iterable<Relation>{
	
	private final String name;
	/**
	 *  
	 * @return le nom de la BD
	 */
	public String getName() {return name;}
	/**
	 * 
	 * @param name le nom de la BD
	 */
	protected BD(String name){ this.name=name;}
	public @Override String toString(){
		String res = "Base de données " + getName() + "\n";
		return res;
	}
	
}
