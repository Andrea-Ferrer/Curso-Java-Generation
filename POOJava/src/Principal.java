import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor para hacer un pre rellenado de un objeto
		CuentaBancaria cuenta_personal = new CuentaBancaria();
		/*
		 * Menú cajero
		 * 1. Retiro
		 * 2. Deposito
		 * 3. Imprimir saldo
		 * 4. Estado de cuenta
		 * 5. Agregar beneficiario
		 * 6. Salir
		 */
		
		
		
		int opcion = 0;
		
		do {

			Scanner leer = new Scanner(System.in);
			
			System.out.println("Menú cuenta bancaria ");
			System.out.println("Ingresa la opción deseada");
			System.out.println("1. Retiro");
			System.out.println("2. Deposito");
			System.out.println("3. Imprimir saldo");
			System.out.println("4. Estado de cuenta");
			System.out.println("5. Agregar beneficiario");
			System.out.println("6. Salir");
			
			opcion = leer.nextInt(); 
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce la cantidad que desea retirar");
				float monto = leer.nextFloat();
				cuenta_personal.retiros(monto);
				System.out.println("*********************************");
				break;
			case 2:
				System.out.println("Ingresa la cantidad que deseas depositar");
				float deposito = leer.nextFloat();
				cuenta_personal.depositos(deposito);
				System.out.println("*********************************");
				break;
			case 3:
				System.out.println("El monto total de su saldo es " + 
			cuenta_personal.consultarSaldo());
				System.out.println("*********************************");
				break;
			case 5:
				System.out.println("Ingrese el nombre del beneficiario");
				String nombre = leer.nextLine();
				cuenta_personal.beneficiario = nombre;
		} 
				
				
	}while (opcion != 6);

		
		/*
		cuenta_personal.beneficiario = "Andrea Ferrer";
		System.out.println("Ingresa el monto a depositar");
		Scanner leer = new Scanner(System.in);
		float deposito = leer.nextFloat();
		
		System.out.println("Ingresa un monto a retirar");
		float retiro = leer.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.println("Tu saldo actual es " + cuenta_personal.consultarSaldo());
		System.out.println(cuenta_personal.beneficiario);
		
		
		CuentaBancaria cuenta_papa = new CuentaBancaria();
		cuenta_papa.beneficiario = "Enrique";
		System.out.println(cuenta_papa.beneficiario);
		*/
	}

}
