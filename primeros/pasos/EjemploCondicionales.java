package primeros.pasos;

public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("hello world");

		int edad = 16;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("eres mayor de edad");
		} else {
			if (cantidad >= 2) {
				System.out.println("eres menor de edad pero vienes acompañado");
			} else {
				System.out.println("eres menor de edad");
			}
		}
	}

}
