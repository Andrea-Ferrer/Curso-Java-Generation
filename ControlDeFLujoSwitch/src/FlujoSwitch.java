
public class FlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Switch
		/*switch(condicion){ 
		 * case valor:
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * 		break;
		 * case valor2:
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * 		break;
		 * default:
		 * 		codigo por defecto;
		}*/
		
		int day = 4;
		String mensaje = "";
		
		switch (day) {
		case 1:
			mensaje = "Lunes";
			break;
		case 2:
			mensaje = "Martes";
			break;
		case 3:
			mensaje = "Miercoles";
			break;
		case 4:
			mensaje = "Jueves";
			break;
		case 5:
			mensaje = "Viernes";
			break;
		case 6:
			mensaje = "Sabado";
			break;
		case 7:
			mensaje = "Domingo";
			break;
		default:
			mensaje = "Dia Invalido";
			break;
			
		}
		System.out.println(mensaje);
		
		
	}

}
