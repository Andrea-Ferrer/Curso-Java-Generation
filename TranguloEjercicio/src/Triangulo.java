import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un programa donde se introduzcan los tres ángulos internos de 
		 * un triángulo y se determine si el triángulo es válido o no
		 */
		Scanner totalOne = new Scanner (System.in);
		System.out.println("Introduce el primer ángulo");
		float valOne = totalOne.nextInt();
		Scanner totalTwo = new Scanner (System.in);
		System.out.println("Introduce el segundo ángulo");
		float valTwo = totalTwo.nextInt();
		Scanner totalThree = new Scanner (System.in);
		System.out.println("Introduce el tercer ángulo");
		float valThree = totalThree.nextInt();
		
		float total = valOne + valTwo + valThree;
		
		if (total == 180) {
			System.out.println("El triangulo es válido");
		}else {
			System.out.println("El triantgulo es invalido");
		}
	}

}
