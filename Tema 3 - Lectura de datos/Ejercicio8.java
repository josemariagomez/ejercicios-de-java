public class Ejercicio8 {
	public static void main(String[] args){
		double horasTrabajadas;
		System.out.print("Introduce tus horas trabajadas: ");
		horasTrabajadas = Double.parseDouble(System.console().readLine());
		double salarioSemanal;
		salarioSemanal = horasTrabajadas * 12;
		System.out.print("Su salario semanal es: " + salarioSemanal);
	}
}
