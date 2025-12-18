package main;

import javax.swing.JOptionPane;

import monedas.ConversorMonedas;
import temperaturas.ConversorTemperatura;

public class Main {
	public static void main(String[] args) {
		
		while(true) {
			String selection = Function.getOption();
			
			try {
				if(selection.equals("Conversor de monedas")) {
					String inputStr = JOptionPane.showInputDialog("Ingresa la cantidad de Pesos Argentinos:");
					if (inputStr == null) continue;
					
					double input = Double.parseDouble(inputStr);
					Function.verificarInput(input);
					ConversorMonedas.convertir(input);
				} else {
					String inputStr = JOptionPane.showInputDialog("Ingresa la temperatura en Celsius:");
					if (inputStr == null) continue;
					
					double input = Double.parseDouble(inputStr);
					ConversorTemperatura.convertir(input);
				}
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor no válido. Por favor, ingresa un número.");
				continue;
			} catch(IllegalArgumentException ex) {
				JOptionPane.showMessageDialog(null, "Debes ingresar un número mayor a 0.");
				continue;
			}
			
			int response = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?", "Confirmar", JOptionPane.YES_NO_OPTION);
			if (response != JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			}
		}
	}
}
