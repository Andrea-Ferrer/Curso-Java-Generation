import java.util.Scanner;

public class NumTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa que pida un número por teclado
		 * Se tiene que hacer un recorrido desde 1 hasta el número introducido.
		 * 
		 * Ejemplo:
		 * Numero introducido: 12
		 * 
		 * numeros pares = 2 + 4 + 6 + 8 + 10+ 12
		 * numeros impares = 1 + 3 + 5 + 7 + 9 + 11
		 * 
		 * Tiene que imprimir la suma de los numeros pares e impares
		 */
		Scanner oper = new Scanner (System.in);
		System.out.println("Introduzca el valor");
		int num = oper.nextInt();
		sumas(num);
	}
	public static void sumas(int num) {
		int par = 0;
		int impar = 0;
		for (int i = 0; i <= num; i++) {
		
		if (i % 2 == 0) {
			par = par + i;
		}else {
			impar = impar + i;
		}
	}
		System.out.println("La suma total de los pares es " + par);
		System.out.println("La suma total de los impares es " + impar);
	}
	
	}
