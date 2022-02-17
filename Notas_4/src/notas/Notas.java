/**
 * 
 */
package notas;

import java.util.Scanner;

/**
 * La clase pública Notas pide introducir una nota por teclado
 * y le asigna una calificación en función de la misma .
 * @author vivas
 * @version 1.0
 *
 */
public class Notas {

	public static void main(String[] args) {
		
/**
 * Es el método principal mediante el que se pide que se  introduzca la nota por teclado y se imprime la calificacion.
 * Se han utilizado funciones de refactorización para renombrar variables.
 */
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
	 * Se sustituye en un primer momento el código que se encarga de especificar la calificación en función
	 * de la nota por un método público que denominamos cali
	 * @param nota El parámetro nota es el número introducido por teclado
	 * @return
	 * @deprecated Use {@link notas.califica#califica(int)} instead
	 */
	public static String cali(int nota) {
		return notas.califica.califica(nota);
	}

	/**
	 * Utilizando funciones de refactorización cambiamos la cabecera del método cali que pasa a llamarse califica
	 * y el parametro nota pasa a llamarse num_nota
	 * @param num_nota El parámetro num_nota es el número introducido por teclado
	 * @return
	 * @deprecated Use {@link califica#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return califica.califica(num_nota);
	}
}
