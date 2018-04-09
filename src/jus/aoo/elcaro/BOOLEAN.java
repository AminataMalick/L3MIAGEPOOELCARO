package jus.aoo.elcaro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BOOLEAN extends Type<Boolean>{

	public BOOLEAN(String name) {super(name);}
	@Override public Boolean deserialisation(DataInputStream is) throws IOException {return is.readBoolean();}
	@Override public void serialisation(DataOutputStream os, Boolean data) throws IOException {os.writeBoolean(data);}
	@Override public void serialisation(String data) {Boolean.parseBoolean(data);}
	// @Override public String getName() {return this.name;}
}
