public class Ejercicio4 {
	public static void main(String[] args){
		double x;
		System.out.print("Introduce un número, por favor: ");
		x = Double.parseDouble(System.console().readLine());
		double y;
		System.out.print("Introduce otro, por favor: ");
		y = Double.parseDouble(System.console().readLine());
		System.out.println("La suma de ambos números es: " + (x+y));
		System.out.println("La resta de ambos números es: " + (x-y));
		System.out.println("El producto de ambos números es: " + (x*y));
		System.out.println("El cociente de ambos números es: " + (x/y));
	}
}
