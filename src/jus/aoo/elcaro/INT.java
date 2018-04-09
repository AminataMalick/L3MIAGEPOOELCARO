package jus.aoo.elcaro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class INT extends Type<Integer>{
	
	public INT(String name) {super(name);}
	@Override public Integer deserialisation(DataInputStream is) throws IOException {return is.readInt();}
	@Override public void serialisation(DataOutputStream os, Integer data) throws IOException {os.writeInt(data);}
	@Override public void serialisation(String data) {Integer.parseInt(data);}
	// @Override public String getName() {return this.name;}
}
