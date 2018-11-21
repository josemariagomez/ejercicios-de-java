public class Ejercicio4 {
	public static void main(String[] args){
		double horasTrabajadas;
		System.out.print("Introduce tus horas trabajadas: ");
		horasTrabajadas = Double.parseDouble(System.console().readLine());
		double salarioSemanal;
		if (horasTrabajadas <= 40){
			salarioSemanal = horasTrabajadas * 12;
			System.out.print("Su salario semanal es: " + salarioSemanal);
		}
		else if (horasTrabajadas > 40){
			salarioSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
			System.out.print("Su salario semanal es: " + salarioSemanal);
		}
	}
}
