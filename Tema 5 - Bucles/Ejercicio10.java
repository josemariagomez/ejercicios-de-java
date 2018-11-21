public class Ejercicio10 {
	public static void main(String[] args){
		System.out.println("Este dice cuántos números positivos has introducido. Para acabar introduce un negativo");
		int numIntroducido;
		int positivos = 0;
		System.out.println("Introduzca un número: ");
		numIntroducido = Integer.parseInt(System.console().readLine());
		while(numIntroducido >= 0) {
			numIntroducido = Integer.parseInt(System.console().readLine());
			positivos++;
		}
		System.out.println("Ha introducido " + positivos + " números positivos.");
	}
}
