package ejercicio3;

import java.util.ArrayList;

public class Characters {
	protected ArrayList<String> characters = new ArrayList<String>();
	private int char_index = -1;

	public Characters(String...args) {
		for (String arg : args) {
			characters.add(arg);
		}
		
	}
	public String next() {
		if (char_index == characters.size()-1) {
			char_index = -1;
		}
		char_index += 1;
		return characters.get(char_index);
		}
	}
