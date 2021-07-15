
public class Persona {
	String name = "";
	String correo = "";
	int age;
	
	public String saludar() {
		return "Hola " + this.name;
	}
	
	public String miEdad() {
		return "Mi edad es " + this.age;
	}
}
