
public class Perro extends Animal implements Mascota, Cuidados {
	
	
	public Perro(String nombre, int edad) {
		super(nombre, edad);
		
	}

	String raza = "";
	String color = "";
	float peso = 0;
	
	
	@Override
	public String comer() {
	
		return ("Comiendo croquetas");
	}

	public String ladrar() {
		// TODO Auto-generated method stub
		return ("guaf guaf");
	}

	@Override
	public String irAlVeterinario() {
		// TODO Auto-generated method stub
		return ("Vacunas");
	}

	@Override
	public String paseo() {
		// TODO Auto-generated method stub
		return ("Vamos al parque");
	}

	@Override
	public String banio() {
		// TODO Auto-generated method stub
		return ("Tomar baño");
	}

}
