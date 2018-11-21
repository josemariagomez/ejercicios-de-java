public class Ejercicio13 {
	public static void main(String[] args){
		System.out.println("Este programa lee una lista de diez números y dice cuántos son positivos y cuántos negativos.");
		int positivos = 0;
		int negativos = 0;
		for(int i = 0; i < 10; i++) {
			int n;
			System.out.print("Introduzca un número: ");
			n = Integer.parseInt(System.console().readLine());
			if 	(n > 0) {
					positivos++;
			}
		}
		negativos = 10 - positivos;
		System.out.print("Ha introducido " + positivos + " números positivos y " + negativos + " negativos");
	}
}
