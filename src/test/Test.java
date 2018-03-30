package test;

import jus.aoo.elcaro.Attribut;
import jus.aoo.elcaro.STRING;
import jus.aoo.elcaro.Schema;
import jus.aoo.elcaro.StateFulInMemory;
import jus.aoo.elcaro.Tuple;
import jus.aoo.elcaro._Tuple;

public class Test {

	public static void main(String[] args) {
		Schema sc = new Schema(new Attribut("NOM", new STRING("string")), new Attribut("PRENOM", new STRING("string")));
		StateFulInMemory relation = new StateFulInMemory("Mine",sc);
		relation.add(new Tuple("MORAT","PHILIPPE"));
		relation.add(new Tuple("BA","AMINATA"));
		relation.add(new Tuple("CHASANE","MELANIE"));
		relation.add(new Tuple("BOTTE","CELINE"));
		relation.add(new Tuple("CARRIER","ANTOINE"));
		for(_Tuple t : relation){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		
	}
}
