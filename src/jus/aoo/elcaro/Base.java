package jus.aoo.elcaro;

import java.util.ArrayList;
import java.util.Iterator;

import relations.Relation;

public class Base extends BD {

	private ArrayList<Relation> listeRelations;
	
	
	public Base(String name) {
		super(name);
		this.listeRelations = new ArrayList<>();
	}

	@Override
	public Iterator<Relation> iterator() {
		return new Iterator<Relation>() {
			private int index = 0;
			@Override public boolean hasNext() {
				return index < listeRelations.size()
			}
			@Override public Object next() {
				
			}
		}
	}

	/*
	 * @Override
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
	 */
}
