public class Ejercicio7 {
	public static void main(String[] args){
		double baseImponible;
		System.out.print("Introduce el precio base: ");
		baseImponible = Double.parseDouble(System.console().readLine());
		double total;
		total = baseImponible * 1.21;
		System.out.print("El precio con iva es: " + total);
	}
}
