package ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Month m1 = new Month("Enero");
		Month m2 = new Month("Febrero");
		Month m3= new Month("Marzo");
		Month m4 = new Month("Abril");
		Month m5 = new Month("Mayo");
		Month m6 = new Month("Junio");
		Month m7 = new Month("Julio");
		Month m9 = new Month("Septiembre");
		Month m10 = new Month("Octubre");
		Month m11 = new Month("Noviembre");
		Month m12 = new Month("Diciembre");
		
		ArrayList<Month> list = new ArrayList<Month> ();

		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m9);
		list.add(m10);
		list.add(m11);
		list.add(m12);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
		}
		
		Month m8 = new Month("Agosto");
		
		System.out.println("------------ Añadimos agosto");
		
		list.add(7, m8);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
		}
	}
}
