import java.util.Scanner;

public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (variable de inicializacion; variable de inicializacion < 10;
		 * variable++);
		 */
		
		//for (int i=0; i < 5; i++){
		//	System.out.println(i + 1);
		//}
			 
		/*
		 * Crear un metodo que reciba por parametro un número y nos muestre
		 * la tabla de multiplicar de ese número
		 * Ejemplo:
		 * 1x1 = 1
		 * 1x2 = 2
		 * 1x3 = 3
		 * ...
		 * 1x10 = 10
		 */
		
		Scanner oper = new Scanner (System.in);
		System.out.println("Introduce un valor");
		int value = oper.nextInt();
		metodo(value);
	}
	public static void metodo(int value) {
		
		for (int i=1; i < 11; i++){
			System.out.println(value + " x " + i + " = " + (value * i));
		}
	}
}

	