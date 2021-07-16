package coleccioines;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * La colecccion SET no puede tener elementos duplicados solo tiene los metodos
		 * heredados d collection existen diferentes tipos de implementaciones
		 * 
		 * hashset: esta implementacion alamacena los elemenos en una tabla hash. es la
		 * que mejor rendimienti tiene pero no los muestra en orden TreeSet: ordena de
		 * mayor a menor los numeros y las letras en orden alfabetico pero es lento
		 * LinkedHashSet
		 */
		// es como si crearas un arreglo, lo nombras
		// Set<String> frutas = new HashSet();
		// le añades el elemento
		// frutas.add("Mango");
		// frutas.add("Kiwi");
		// frutas.add("Toronja");
		// frutas.add("Uva");
		// frutas.add("Manzana");
		// frutas.add("Fresa");
		// frutas.add("Mandarina");
		// frutas.add("Pera");

		// for(String fruta: frutas) {
		// System.out.println(fruta);

		// }
		// }

//}

		/*
		 * Acceso posicional a elementos: manipula elementos en función de su posición
		 * en la lista. Búsqueda de elementos: busca un elemento concreto de la lista y
		 * devuelve su posición. Rango de operación: permite realizar ciertas
		 * operaciones sobre ragos de elementos dentro de la propia lista.
		 */

		List<String> frutas2 = new ArrayList<String>();
//le añades el elemento 
		frutas2.add("Mango");
		frutas2.add("Kiwi");
		frutas2.add("Toronja");
		frutas2.add("Uva");
		frutas2.add("Manzana");
		frutas2.add("Fresa");
		frutas2.add("Mandarina");
		frutas2.add("Pera");

		for (String f : frutas2) {
			System.out.println(f);

		}
		int pera = frutas2.indexOf("Pera"); // indexOf busca el elemento
		System.out.println(pera);
		System.out.println(frutas2.get(pera));// obtiene el elemento entre parentesis

		// para numeros
		List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(123);
		agenda.add(13);
		agenda.add(12);

		for (Integer a : agenda) {
			System.out.println(a);
		}
		
		//metodo de clave HASHMAP
		//No garantiza ningun orden, puede imprimir en numero o letra 
		//es el mejor para un buen rendimiento
		// si cambias HashMap por TreeMap, entonces ordena de menor a mayor
		Map diccionario = new HashMap();
		// put= insertar, diccionario.put(clave, valor);
		//diccionario.put("elemento1", "Alex Quiroz");
		//System.out.println(diccionario.get("elemento1"));
		diccionario.put(1, "Alex Quiroz");
		diccionario.put(2, "Carlos Eduardoz");
		for (Iterator<Map.Entry<Integer, String>> entries = diccionario.entrySet().iterator(); entries.hasNext(); ) {
		    Map.Entry<Integer, String> entry = entries.next();
		    System.out.println(entry.getKey()+" : "+entry.getValue());
	}


}}

		



