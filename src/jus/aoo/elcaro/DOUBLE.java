package jus.aoo.elcaro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DOUBLE extends Type<Double>{

	public DOUBLE(String name) {super(name);}
	
	@Override
	public Double deserialisation(DataInputStream is) throws IOException {
		return is.readDouble();
	}

	@Override
	public void serialisation(DataOutputStream os, Double data) throws IOException {
		os.writeDouble(data);		
	}

	@Override
	public void serialisation(String data) {
		Double.parseDouble(data);		
	}

	@Override public String getName() {return name;}
	
	
}
