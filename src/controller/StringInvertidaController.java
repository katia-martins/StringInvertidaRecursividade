
/*
 * Autor: Katia Martins Goncalves
 */

package controller;

public class StringInvertidaController {

	public StringInvertidaController() {
		super();
	}
	
	public String inverse(String str, int index) {
		
		if (index == 0) {
			return "";
		} else { 
			return str.substring(index - 1, index) + inverse(str, index - 1);
		}
	}
}