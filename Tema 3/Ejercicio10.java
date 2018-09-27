public class Ejercicio10 {
	public static void main(String[] args){
		Double mb;
		System.out.print("Introduce cuantos MB convertir a KB: ");
		mb = Double.parseDouble(System.console().readLine());
		double kb;
		kb = mb * 1024;
		System.out.printf(mb + "MB son " + kb + "KB");
	}
}
