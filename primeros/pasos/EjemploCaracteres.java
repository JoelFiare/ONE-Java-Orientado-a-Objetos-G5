package primeros.pasos;

public class EjemploCaracteres {
	
	public static void main(String[] args) {
		char caracter = 'a'; // Un solo caracter comillas simples
		System.out.println(caracter);

		caracter = 65;
		System.out.println(caracter);

		caracter = 65 + 1;
		char segundoCaracter = (char) (caracter + 1);
		System.out.println(segundoCaracter);

		String palabra = "coffe babe";
		System.out.println(palabra);

		palabra = palabra + " 2023";
		System.out.println(palabra);
	}
}