package main;

import javax.swing.JOptionPane;

public class Function {
	public static String getOption() {
		String[] options = {"Conversor de monedas", "Conversor de temperatura"};
		Object selection = JOptionPane.showInputDialog(null, 
				"Elige el tipo de conversion", "Menu", 
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if(selection == null) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
			System.exit(0);
		}
		
		return selection.toString();
	}

		/**
		 * Metodo que verifica si el numero ingresado es mayor que 0
		 * @param input
		 */
		public static void verificarInput(double input) {
			if(input <= 0)
				throw new IllegalArgumentException();
		}
}