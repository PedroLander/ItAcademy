package ejercicio2;

import java.util.*;
import org.apache.commons.collections4.list.SetUniqueList;

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
		
		ArrayList<Month> list = new ArrayList<Month>();
		SetUniqueList uni_list = SetUniqueList.setUniqueList(list);
		
		uni_list.add(m1);
		uni_list.add(m2);
		uni_list.add(m3);
		uni_list.add(m4);
		uni_list.add(m5);
		uni_list.add(m6);
		uni_list.add(m7);
		uni_list.add(m9);
		uni_list.add(m10);
		uni_list.add(m11);
		uni_list.add(m12);
		
		Iterator<Month> mon1 = uni_list.listIterator();

		for (int i = 0; i < uni_list.size(); i++) {
			Month month = mon1.next();
			System.out.println(month.name);
		}
		
		Month m8 = new Month("Agosto");
		
		System.out.println("------------ Añadimos agosto 3 veces");
		
		uni_list.add(7, m8);
		uni_list.add(7, m8);
		uni_list.add(7, m8);

		Iterator<Month> mon2 = uni_list.listIterator();

		for (int i = 0; i < uni_list.size(); i++) {
			Month month = mon2.next();
			System.out.println(month.name);
		}
	}
}
