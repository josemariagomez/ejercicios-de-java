public class Ejercicio18 {
	public static void main(String[] args){
		System.out.println("Este programa dice la primera cifra de un número");
		int num;
		System.out.print("Introduce un número de máximo 5 cifras: ");
		num = Integer.parseInt(System.console().readLine());
		if (num < 10){
			System.out.print("La primera cifra de tu númmero es: " + num);
		}else if ((num >= 10) && (num <100)){
			System.out.print("La primera cifra de tu númmero es: " + (num / 10));
		}else if ((num >= 100) && (num <1000)){
			System.out.print("La primera cifra de tu númmero es: " + (num / 100));
		}else if ((num >= 1000) && (num <10000)){
			System.out.print("La primera cifra de tu númmero es: " + (num / 1000));
		}else if ((num >= 10000) && (num <100000)){
			System.out.print("La primera cifra de tu númmero es: " + (num / 10000));
		}
	}
}
