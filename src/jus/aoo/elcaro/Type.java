package jus.aoo.elcaro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author carriean
 *
 * @param <T> le type de représentation des valeurs de ce type
 */
public abstract class Type <T> {
	protected String name; // nom du type
	protected Type(String name){ this.name=name;}
	public abstract T deserialisation(DataInputStream is) throws IOException;
	public String toString(){return this.name;}
	public abstract void serialisation(DataOutputStream os, T data) throws IOException;
	public abstract void serialisation(String data);
}