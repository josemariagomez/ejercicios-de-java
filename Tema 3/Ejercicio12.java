public class Ejercicio12 {
	public static void main(String[] args){
		double nota1;
		System.out.print("Introduce la nota del primer examen: ");
		nota1 = Double.parseDouble(System.console().readLine());
		double trimestre;
		System.out.print("Introduce la nota que te gustaría en el trimestre: ");
		trimestre = Double.parseDouble(System.console().readLine());
		double nota2;
		nota2 = (trimestre - 0.4 * nota1) / 0.6;
		System.out.printf("Debes sacar un %.2f en el segundo examen", nota2);
	}
}
