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
		
		
		/*Création de la base de données à metttre en oeuvre*/
		/*PRODUIT*/
		Schema sc1 = new Schema(new Attribut("DENOMINATION", new STRING("string")), new Attribut("ENERGIE", new STRING("int")), new Attribut("PROTEINE", new STRING("double")));
		StateFulInMemory relation1 = new StateFulInMemory("PRODUIT",sc1);
		relation.add(new Tuple("Epautre",1340, 11.5));
		relation.add(new Tuple("Orge",1430, 11.0));
		relation.add(new Tuple("Avoine",1530, 12.5));
		relation.add(new Tuple("Millet",1510, 10.5));
		relation.add(new Tuple("Mais",1498, 9.0));
		relation.add(new Tuple("Riz",1492, 7.5));
		relation.add(new Tuple("Segle",1323, 8.8));
		relation.add(new Tuple("Ble",1342, 11.5));

		for(_Tuple t : relation1){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		
		/*PRODUCTEUR*/
		Schema sc2 = new Schema(new Attribut("ID_PRODUCTEUR", new STRING("int")), new Attribut("NOM", new STRING("string")), new Attribut("PRENOM", new STRING("string")));
		StateFulInMemory relation2 = new StateFulInMemory("PRODUCTEUR",sc2);
		relation.add(new Tuple(1,"BERNARD", "ALAIN"));
		relation.add(new Tuple(2,"PERRIER", "CHARLES"));
		relation.add(new Tuple(3,"LABBE", "CAROLINE"));

		for(_Tuple t : relation2){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		
	}
}
