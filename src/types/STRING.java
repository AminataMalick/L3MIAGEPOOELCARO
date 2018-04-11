package types;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class STRING extends Type<String> {
	
	public STRING(String name) {super(name);}
	@Override public String deserialisation(DataInputStream is) throws IOException {return is.readUTF();}
	@Override public void serialisation(DataOutputStream os, String data) throws IOException {os.writeUTF(data);}
	@Override public void serialisation(String data) {}
	@Override public String getName() {return name;}
}
