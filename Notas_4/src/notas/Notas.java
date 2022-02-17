/**
 * 
 */
package notas;

import java.util.Scanner;

/**
 * @author vivas
 *
 */
public class Notas {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();

		calificacion = notas.califica.califica(nota);

		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * @param nota
	 * @return
	 * @deprecated Use {@link notas.califica#califica(int)} instead
	 */
	public static String cali(int nota) {
		return notas.califica.califica(nota);
	}

	/**
	 * @param num_nota
	 * @return
	 * @deprecated Use {@link califica#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return califica.califica(num_nota);
	}
}
