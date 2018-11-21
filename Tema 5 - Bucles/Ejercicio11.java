public class Ejercicio11 {
	public static void main(String[] args){
		System.out.println("Este dice el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.");
		int numIntroducido;
		System.out.print("Introduzca un número: ");
		numIntroducido = Integer.parseInt(System.console().readLine());
		for(int i = 0; i < 5; i++) {
			System.out.println(numIntroducido + "   " + Math.pow(numIntroducido, 2) + "   " + Math.pow(numIntroducido, 3));
			numIntroducido++;
		}
	}
}
