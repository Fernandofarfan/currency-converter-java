package temperaturas;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	private static final String[] OPCIONES = {"Celcius a Kelvin.", "Celcius a Fahrenheit.", "Fahrenheit a Celcius.", "Kelvin a Celcius."};
	
	public static void convertir(double input) {
		String opcion = (String) JOptionPane.showInputDialog(null, 
				"Elige una opcion", "Temperatura", 
				JOptionPane.QUESTION_MESSAGE, null, OPCIONES, OPCIONES[0]);
		
		if(opcion == null) {
			return; // Regresar al menú principal
		}
		
		double out = 0;
		if(opcion.equals(OPCIONES[0])) // Celcius a Kelvin
			out = input + 273.15;
		else if(opcion.equals(OPCIONES[1])) // Celcius a Fahrenheit
			out = (input * 9/5) + 32;
		else if(opcion.equals(OPCIONES[2])) // Fahrenheit a Celcius
			out = (input - 32) * 5/9;
		else if(opcion.equals(OPCIONES[3])) // Kelvin a Celcius
			out = input - 273.15;
			
		out = (double) Math.round(out * 100) / 100;
		
		String[] escalas = control(opcion);
		JOptionPane.showMessageDialog(null, 
				String.format("%.2fº grados %s son %.2fº grados %s", input, escalas[0], out, escalas[1]));
	}
	

	/**
	 * Extrae las escalas de temperatura de la cadena "Escala1 a Escala2"
	 * @param opcion La cadena de opción seleccionada
	 * @return Un arreglo con [escalaOrigen, escalaDestino]
	 */
	private static String[] control(String opcion) {
		// Ejemplo: "Celcius a Kelvin." -> ["Celcius", "Kelvin"]
		String cleanOpcion = opcion.replace(".", "");
		String[] parts = cleanOpcion.split(" a ");
		if (parts.length == 2) {
			return parts;
		}
		return new String[]{opcion, ""};
	}
}
