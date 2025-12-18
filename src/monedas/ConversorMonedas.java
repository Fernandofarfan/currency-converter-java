package monedas;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	private static final Map<String, Double> FACTOR_CONVERSION = new HashMap<String, Double>();
	 static {
	        FACTOR_CONVERSION.put("Peso/s a Dolar/es", 0.0036);
	        FACTOR_CONVERSION.put("Peso/s a Euro/s", 0.0033);
	        FACTOR_CONVERSION.put("Peso/s a Libra/s", 0.028);
	        FACTOR_CONVERSION.put("Peso/s a Yen/es", 0.52);
	        FACTOR_CONVERSION.put("Peso/s a Won/es", 4.69);
	        FACTOR_CONVERSION.put("Dolar/es a Peso/s", 1 / 0.0036);
	        FACTOR_CONVERSION.put("Euro/s a Peso/s", 1 / 0.0033);
	        FACTOR_CONVERSION.put("Libra/s a Peso/s", 1 / 0.028);
	        FACTOR_CONVERSION.put("Yen/es a Peso/s", 1 / 0.52);
	        FACTOR_CONVERSION.put("Won/es a Peso/s", 1 / 4.69);
	    }
	
	 
	public static void convertir(double input) {
		Object[] keys = FACTOR_CONVERSION.keySet().toArray();
		String opcion = (String) JOptionPane.showInputDialog(null, 
				"Seleccione la moneda que quieres convertir", "Moneda", 
				JOptionPane.PLAIN_MESSAGE, null, keys, keys[0]);
		
		if(opcion == null) {
			return; // Regresar al menú principal en lugar de cerrar el programa
		}
		
		double out = FACTOR_CONVERSION.get(opcion) * input;
		out = Math.floor(out * 1000) / 1000;
		
		String[] monedas = controlMoneda(opcion);
		JOptionPane.showMessageDialog(null, 
				String.format("%.2f %s son %.3f %s", input, monedas[0], out, monedas[1].toLowerCase()));
	}

	/**
	 * Extrae los nombres de las monedas de la cadena "De a Para"
	 * @param opcion La cadena de opción seleccionada
	 * @return Un arreglo con [monedaOrigen, monedaDestino]
	 */
	private static String[] controlMoneda(String opcion) {
		// Ejemplo: "Peso/s a Dolar/es" -> ["Peso/s", "Dolar/es"]
		String[] parts = opcion.split(" a ");
		if (parts.length == 2) {
			return parts;
		}
		return new String[]{opcion, ""};
	}
}
