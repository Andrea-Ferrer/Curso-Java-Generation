import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un programa donde se introduzcan los tres �ngulos internos de 
		 * un tri�ngulo y se determine si el tri�ngulo es v�lido o no
		 */
		Scanner totalOne = new Scanner (System.in);
		System.out.println("Introduce el primer �ngulo");
		float valOne = totalOne.nextInt();
		Scanner totalTwo = new Scanner (System.in);
		System.out.println("Introduce el segundo �ngulo");
		float valTwo = totalTwo.nextInt();
		Scanner totalThree = new Scanner (System.in);
		System.out.println("Introduce el tercer �ngulo");
		float valThree = totalThree.nextInt();
		
		float total = valOne + valTwo + valThree;
		
		if (total == 180) {
			System.out.println("El triangulo es v�lido");
		}else {
			System.out.println("El triantgulo es invalido");
		}
	}

}
