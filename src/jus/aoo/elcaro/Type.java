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
	
	/**
	 * 
	 * @param name Le nom du type que l'on instancie
	 */
	protected Type(String name){ 
		this.name=name;
	}
	
	/**
	 * 
	 * @param is le flux de données entrant
	 * @return Un type T
	 * @throws IOException
	 */
	public abstract T deserialisation(DataInputStream is) throws IOException;
	
	/**
	 * @return le nom du type correspondant 
	 */
	public String toString(){
		return this.name;
	}
	
	/**
	 * 
	 * @param os le flux de données sortant
	 * @param data le type à sérialiser
	 * @throws IOException 
	 */
	public abstract void serialisation(DataOutputStream os, T data) throws IOException;
	
	/**
	 * 	
	 * @param data le type à sérialiser
	 */
	public abstract void serialisation(String data);
}