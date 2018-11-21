public class Ejercicio17 {
	public static void main(String[] args){
		System.out.println("Este programa dice la última cifra de un número");
		int num;
		System.out.print("Introduce un número: ");
		num = Integer.parseInt(System.console().readLine());
		System.out.print("La última cifra de tu númmero es: " + (num % 10));
	}
}
