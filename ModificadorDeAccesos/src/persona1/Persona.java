package persona1;

public class Persona {
	/*
	//Modificcador de acceso default, se puede acceder a los atributos y objetos
	dentro del paquete
	//Si pones la palabra public se hace publica la variable
	*/
	public String nombre = "";
	
	/*Modificador de acceso privado, se puede acceder solo dentro de la misma
	 * clase
	 * 
	 */
	private int edad = 0;
	
	/*
	 * Modificador protected, puede ser accedido dentro de la misma clase y
	 * el mismo paquete.
	 */
	protected String domicilio = "";
	
	/*
	 * Modificador public, se puede acceder desde la misma clase
	 * y otros paquetes
	 */
	public float estatura = 0;
	
	String saludar() {
		return "Hola, mi nombre es " + this.nombre + "mi edad es " + this.edad
				+ "Mi domicilio es " + this.domicilio;
	}
}
