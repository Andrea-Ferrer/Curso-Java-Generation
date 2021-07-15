import java.util.Scanner;

public class CalcSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear una calculadora que pueda sumar, restar, multiplicar y dividir
		 * 2 numeros.
		 * La calculadora debe pedir los dos numeros y posterior a eso preguntar
		 * wue operacion se quiere realizar, el menu es el siguiente:
		 *1.SUma
		 *2.Resta
		 *3.Multiplicacion
		 *4.Division
		 *AL final debe mostrar los resultados de la operacion
		 */
		
		
		Scanner oper = new Scanner (System.in);
		System.out.println("Introduzca el primer valor");
		int numOne = oper.nextInt();
		System.out.println("Introduzca el segundo valor");
		int numTwo = oper.nextInt();
		System.out.println("¿Qué operación quieres realizar?");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicacion");
		System.out.println("4) Division");
		int operacion = oper.nextInt();
		
	
		switch (operacion){
			case 1:
				System.out.println("La suma es " + (numOne + numTwo));
				break;
			case 2:
				System.out.println("La resta es " + (numOne - numTwo));
				break;
			case 3:
				System.out.println("La multiplicación es " + (numOne * numTwo));
				break;
			case 4:
				System.out.println("La división es " + (numOne / numTwo));
				break;
			default:
				System.out.println("Opción invalida");
				break;
		}
	}

}
