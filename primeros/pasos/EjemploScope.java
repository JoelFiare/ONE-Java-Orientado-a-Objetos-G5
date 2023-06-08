package primeros.pasos;
// Alcance de las variables

public class EjemploScope {

	public static void main(String[] args) {
		System.out.println("hello world");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja; //todo boolean por defecto es false
						  //java no permite usar una variable que no este inicializada
		
		if (cantidadPersonas > 1) {
			esPareja = true;
		} else {
			esPareja = false;
		}
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("El valor de la condicion es: " + esPareja);

		if (puedeEntrar) {
			System.out.println("Puede entrar");
		} else {
			System.out.println("NO puedes entrar");
		}
	}
}