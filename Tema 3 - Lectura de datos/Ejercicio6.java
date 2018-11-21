public class Ejercicio6 {
	public static void main(String[] args){
		float base;
		System.out.print("Introduce la base del triángulo, por favor: ");
		base = Float.parseFloat(System.console().readLine());
		float altura;
		System.out.print("Introduce ahora la altura, por favor: ");
		altura = Float.parseFloat(System.console().readLine());
		System.out.println("El área del triángulo es: " + (base*altura/2));
	}
}
