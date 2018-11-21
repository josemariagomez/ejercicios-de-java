public class Ejercicio8 {
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
			System.out.println("La nota media es: " + media);
			if (media < 5) {
				System.out.print("Tendrás un insuficiente en el boletín");
			}else if ((media >= 5) && (media < 6)) {
				System.out.print("Tendrás un suficiente en el boletín");
			}else if ((media >= 6) && (media < 7)) {
				System.out.print("Tendrás un bien en el boletín");
			}else if ((media >= 7) && (media < 9)) {
				System.out.print("Tendrás un notable en el boletín");
			}else if (media >= 9) {
				System.out.print("Tendrás un sobresaliente en el boletín");
		}
		}
	}
}
