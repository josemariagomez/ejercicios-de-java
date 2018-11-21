public class Ejercicio11 {
	public static void main(String[] args){
		Double kb;
		System.out.print("Introduce cuantos KB convertir a MB: ");
		kb = Double.parseDouble(System.console().readLine());
		double mb;
		mb = kb / 1024;
		System.out.printf(kb + "KB son " + mb + "MB");
	}
}
