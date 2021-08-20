
/*
 * Autor: Katia Martins Goncalves
 */

package view;

import javax.swing.JOptionPane;

import controller.StringInvertidaController;

public class Principal {

	public static void main(String[] args) {
		
		StringInvertidaController strinv = new StringInvertidaController();
		
		String str = JOptionPane.showInputDialog(null, "Digite uma palavra");
		
		String res = strinv.inverse(str, str.length());
		
		System.out.println(res);
	}
	
}