import java.util.Scanner;
public class ControlDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*if (condicion) si se cumple{
		 * c�digo
		 * c�digo
		 * c�digo
		 * c�digo
		 * }
		 * 
		 * if (condicion) si se cumple {
		 *	c�digo
		 *	c�digo
		 *	c�digo 
		 * } else {
		 * 		C�digo
		 * 		c�digo
		 * 		c�digo
		 * }
		 * 
		 * 
		 * if (condicion) si se cumple {
		 *	c�digo
		 *	c�digo
		 *	c�digo 
		 * }
		 *else if (condicion) si se cumple{
		 *
		 *} else if (condicion) si se cumple{
		 *
		 *} else
		 */
		
		/*
		 * Se lee la edad del usuario por consola, si la edad es mayor a 18
		 * a�os, se muestra un mensaje al usuario que puede votar, en caso
		 * contrario se mostrara un mensaje indicando que no puede votar
		 */
		
		
		/*
		 * Escribir un programa que pida el nombre y la edad de un participante
			si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
			mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
			el programa de generation Java Full Stack".
			En caso de no cumplirse la condici�n, mostrar un mensaje que diga
			"No cumples lo requisitos para el bootcamp Java Full Stack"
		 */
		
		
		Scanner entradaName = new Scanner (System.in);
		System.out.println ("Introduzca su nombre:");
		String name = entradaName.nextLine();
		Scanner leerEdad = new Scanner (System.in);
		System.out.println("Ingresa tu edad");
		int edad = leerEdad.nextInt();
		
		String mensaje = ingreso(edad,name);
		System.out.println(mensaje);
	}	
		public static String ingreso(int edad, String name) {
			String mensaje = "";
			if (edad >= 18 & edad <= 29) {
				mensaje = "�Felicidades " + name + 
						" estas aceptado en el programa de Java Full Stack!";
		} else {
			mensaje = "No cumples con los requisitos para el bootcamp.";
		}
		/*
		String mensaje = votar(edad);
		System.out.println(mensaje);
	}	
		public static String votar (int edad) {
			String mensaje = "";
			if (edad >= 18) {
				mensaje = "�Felicidades, puedes votar!";
			} else {
				mensaje = "No puedes votar, eres menor de edad.";
			}
			
			return mensaje;
			*/
			return mensaje;
		
		
		
		}
}
