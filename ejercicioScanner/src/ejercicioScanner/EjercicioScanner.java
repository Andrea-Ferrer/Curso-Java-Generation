package ejercicioScanner;
import java.util.Scanner;
public class EjercicioScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ("Introduzca su nombre:");
		String entradaTeclado = "";
		//Creacion de un objeto scanner
		Scanner entradaEscaner = new Scanner (System.in);
		//Invocamos un método sobre un objeto Scanner
		entradaTeclado = entradaEscaner.nextLine ();
		
		System.out.println ("Bienvenida  " + entradaTeclado);

	}

}
