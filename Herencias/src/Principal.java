
public class Principal {
	
	
	public static void main (String[] args) {
		
		//Animal animal = new Animal ();
		//System.out.println(animal.comer());
		
		Perro canelo = new Perro ("Canelo", 3);
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		System.out.println(canelo.nombre);
		System.out.println(canelo.edad);
		
		Gato pulgas = new Gato ("bigotes", 2, "cafe");
		System.out.println(pulgas.comer());
		
	}
}
