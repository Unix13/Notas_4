/**
 * 
 */
package notas;

import java.util.Scanner;

/**
 * La clase p�blica Notas pide introducir una nota por teclado
 * y le asigna una calificaci�n en funci�n de la misma .
 * @author vivas
 * @version 1.0
 *
 */
public class Notas {

	public static void main(String[] args) {
		
/**
 * Es el m�todo principal mediante el que se pide que se  introduzca la nota por teclado y se imprime la calificacion.
 * Se han utilizado funciones de refactorizaci�n para renombrar variables.
 */
		Scanner reader = new Scanner(System.in);// Para pedir n�meros por teclado
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();

		calificacion = notas.califica.califica(nota);

		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * Se sustituye en un primer momento el c�digo que se encarga de especificar la calificaci�n en funci�n
	 * de la nota por un m�todo p�blico que denominamos cali
	 * @param nota El par�metro nota es el n�mero introducido por teclado
	 * @return
	 * @deprecated Use {@link notas.califica#califica(int)} instead
	 */
	public static String cali(int nota) {
		return notas.califica.califica(nota);
	}

	/**
	 * Utilizando funciones de refactorizaci�n cambiamos la cabecera del m�todo cali que pasa a llamarse califica
	 * y el parametro nota pasa a llamarse num_nota
	 * @param num_nota El par�metro num_nota es el n�mero introducido por teclado
	 * @return
	 * @deprecated Use {@link califica#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return califica.califica(num_nota);
	}
}
