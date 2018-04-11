package test;

import java.util.ArrayList;

import jus.aoo.elcaro.Attribut;
import jus.aoo.elcaro.DOUBLE;
import jus.aoo.elcaro.INT;
import jus.aoo.elcaro.Projection;
import jus.aoo.elcaro.Relation;
import jus.aoo.elcaro.STRING;
import jus.aoo.elcaro.Schema;
import jus.aoo.elcaro.Selection;
import jus.aoo.elcaro.StateFulInMemory;
import jus.aoo.elcaro.Tuple;
import jus.aoo.elcaro._Attribut;
import jus.aoo.elcaro._Predicat;
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
		Schema sc1 = new Schema(new Attribut("DENOMINATION", new STRING("string")), new Attribut("ENERGIE", new INT("int")), new Attribut("PROTEINE", new DOUBLE("double")));
		StateFulInMemory relation1 = new StateFulInMemory("PRODUIT",sc1);
		relation1.add(new Tuple("Epautre",1340, 11.5));
		relation1.add(new Tuple("Orge",1430, 11.0));
		relation1.add(new Tuple("Avoine",1530, 12.5));
		relation1.add(new Tuple("Millet",1510, 10.5));
		relation1.add(new Tuple("Mais",1498, 9.0));
		relation1.add(new Tuple("Riz",1492, 7.5));
		relation1.add(new Tuple("Segle",1323, 8.8));
		relation1.add(new Tuple("Ble",1342, 11.5));

		/*for(_Tuple t : relation1){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}*/
		
		/*PRODUCTEUR*/
		Schema sc2 = new Schema(new Attribut("ID_PRODUCTEUR", new INT("int")), new Attribut("NOM", new STRING("string")), new Attribut("PRENOM", new STRING("string")));
		StateFulInMemory relation2 = new StateFulInMemory("PRODUCTEUR",sc2);
		relation2.add(new Tuple(1,"BERNARD", "ALAIN"));
		relation2.add(new Tuple(2,"PERRIER", "CHARLES"));
		relation2.add(new Tuple(3,"LABBE", "CAROLINE"));
		relation2.add(new Tuple(3,"TOTO", "TATA"));

		for(_Tuple t : relation2){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------test sélection--------------------");
		
		Relation r = new Selection(relation1, new _Predicat(){

			@Override public boolean eval(_Tuple t) {
				return ((Integer)t.get(1))>1450;
			}
			
		});
		System.out.println(r.toString());
		
		/*for(_Tuple t : r){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}*/
		
		System.out.println("--------------------test projection--------------------");
		
		Schema sch = new Schema(sc2.getAttribut(0));
		
		Relation pr = new Projection(relation2, sch);
		
		System.out.println(pr.toString());
		
		/*for(_Tuple t : pr){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}*/
	}
}
