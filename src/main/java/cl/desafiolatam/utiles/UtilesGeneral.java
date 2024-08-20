package cl.desafiolatam.utiles;

public class UtilesGeneral {

	/**
	 * Método que permite evaluar si un número es par o impar
	 * 
	 * @param int numero
	 * @return boolean
	 * @author: Autor <autor@desafiolata.com>
	 * @version: 16/08/2022
	 */
	public boolean esPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método que retorna el factorial de nu número
	 * 
	 * @param int numero
	 * @return double factorial
	 * @author: Autor <autor@desafiolata.com>
	 * @version: 16/08/2022
	 */
	public double getFactorial(int num) {

		// inicializacion de variables de metodo
		double factorial;

		// es importante inicializarlo a 1, ya que multiplicará-
		factorial = 1;

		// por ejemplo: el factorial de 10 es, 10*9*8*7*6*5*4*3*2*1
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}

		// Retorno de factorial
		return factorial;
	}
	

}
