package primeros.pasos;

public class EjemploCondicionalesBoolean {

	public static void main(String[] args) {
		System.out.println("hello world");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("El valor de la condicion es: " + esPareja);

		if (puedeEntrar) {
			System.out.println("Puede entrar");
		} else {
			System.out.println("NO puedes entrar");
		}
	}

}
