/**
 * Calculadora
 * Objetivo: Hacer las funcionalidades de suma, resta, division y multiplicación
 * 
 * @author Carlos Martinez
 * @author Paulo Sánchez
 * @author Carlos Estrada 
 * @version 1.0 finalizado 01/02/2022
 */
public class Calculadora implements Calculator {

	@Override
	public double calculate(String operation, double num1, double num2) {
		double calc = 0.25;
		String suma = "+";
		String resta = "-";
		String multi = "*";
		String div = "/";
		
		if (operation.equals(suma)) {
			calc = num1 + num2;
		}
		if (operation.equals(resta)) {
			calc = num1 - num2;
		}
		if(operation.equals(multi)) {
			calc = num1*num2;
		}
		if(operation.equals(div)) {
			calc = num1/num2;
		}
		return calc;
	}

}
