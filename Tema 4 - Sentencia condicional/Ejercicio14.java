public class Ejercicio1 {
	public static void main(String[] args){
		System.out.println("Este programa dice si un número es par y dividible entre 5");
		int num1;
		System.out.print("Introduce el número: ");
		num1 = Integer.parseInt(System.console().readLine());
		if((num1 % 2) == 0) {
			System.out.print("El número es par ");
			if((num1 % 5) == 0) {
				System.out.print("y divisible entre 5");
			}else {
				System.out.print("pero no divisible entre 5");
			}
		}else {
			System.out.print("El número es impar ");
			if((num1 % 5) == 0) {
				System.out.print("y divisible entre 5");
			}else {
				System.out.print("y no divisible entre 5");
			}
		}
	}
}
