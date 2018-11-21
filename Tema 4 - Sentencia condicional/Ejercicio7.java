public class Ejercicio7 {
	public static void main(String[] args){
		System.out.println("Este programa calcula la media de 3 notas");
		double nota1;
		System.out.print("Introduce la nota 1: ");
		nota1 = Double.parseDouble(System.console().readLine());
		double nota2;
		System.out.print("Introduce la nota 2: ");
		nota2 = Double.parseDouble(System.console().readLine());
		double nota3;
		System.out.print("Introduce la nota 3: ");
		nota3 = Double.parseDouble(System.console().readLine());
		double media;
		if ((nota1 > 10) || (nota2 > 10) || (nota3 > 10)) {
			System.out.print("Alguna nota es incorrecta. Debe ser menor o igual que 10");
		}else {
			media = (nota1 + nota2 + nota3) / 3;
			System.out.print("La nota media es: " + media);
		}
	}
}
