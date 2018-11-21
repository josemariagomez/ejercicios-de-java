public class Ejercicio21 {
	public static void main(String[] args){
		System.out.println("Este programa tu nota de Programación");
		double ex1, ex2;
		System.out.print("Introduce la nota del primer examen: ");
		ex1 = Double.parseDouble(System.console().readLine());
		System.out.print("Introduce la nota del segundo examen: ");
		ex2 = Double.parseDouble(System.console().readLine());
		if (((ex1 + ex2) / 2) >= 5){
			System.out.print("Tu nota media es " + ((ex1 + ex2) / 2));
		}else {
			String rec;
			System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
			rec = System.console().readLine().toLowerCase();
			if (rec.equals("apto")) {
				System.out.print("Tu nota media es un 5");
			}else {
				System.out.print("Tu nota media es " + ((ex1 + ex2) / 2));
			}
		}
	}
}
