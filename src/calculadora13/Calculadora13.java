package calculadora13;

/**
 * Clase CalculadoraGIT13 Calculadora básica del ejercicio 6.
 * 
 * @author Beatriz
 */	
	/**
	 * Suma dos números enteros.
	 *
	 * @param a primer operando
	 * @param b segundo operando
	 * @return resultado de la suma
	 */
public class Calculadora13 {

	public int sumar(int a, int b) {
		return a + b;
	}

	/**
	 * restar dos números enteros.
	 *
	 * @param a primer operando
	 * @param b segundo operando
	 * @return resultado de la resta
	 */
	public int restar(int a, int b) {
		return a - b;
	}

	/**
	 * multiplicar dos números enteros.
	 *
	 * @param a primer operando
	 * @param b segundo operando
	 * @return resultado de la multiplicacion
	 */
	public int multiplicar(int a, int b) {
		return a * b;
	}

	/**
	 * dividir dos números enteros.
	 *
	 * @param a primer operando
	 * @param b segundo operando
	 * @return resultado de la division
	 */
	public double dividir(int a, int b) {
		if (b == 0) {
			System.out.println("Error: división entre cero");
			return 0;
		}
		return (double) a / b;
	}

	/**
	 * potencia de dos números enteros.
	 *
	 * @param a primer operando
	 * @param b segundo operando
	 * @return resultado de la potencia
	 */

	public int potencia(int base, int exponente) {
		int resultado = 1;
		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}
		return resultado;
	}

	public int modulo(int a, int b) {
		return a % b;
	}
}
