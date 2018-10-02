public class Ejercicio5 {
	public static void main(String[] args){
		System.out.println("Este programa resuelve ecuaciones del tipo ax + b = 0");
		double a;
		System.out.print("Introduce el valor de a: ");
		a = Double.parseDouble(System.console().readLine());
		double b;
		System.out.print("Introduce el valor de b: ");
		b = Double.parseDouble(System.console().readLine());
		double x;
		if (a != 0){
			x = (-b) / a;
			System.out.print("x = " + x);
		}
		else if ((a == 0) && (b == 0)){
			System.out.print("0 = 0 Infinitas soluciones");
		}else if (a == 0){
			System.out.print("No es posible");

		}
	}
}
