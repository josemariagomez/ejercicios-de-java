public class Ejercicio19 {
	public static void main(String[] args){
		System.out.println("Este programa dice cuantas cifras tiene un número");
		int num;
		System.out.print("Introduce un número de máximo 5 cifras: ");
		num = Integer.parseInt(System.console().readLine());
		if (Math.abs(num) < 10){
			System.out.print("Tiene 1 cifra");
		}else if ((Math.abs(num) >= 10) && (Math.abs(num) <100)){
			System.out.print("Tiene 2 cifras");
		}else if ((Math.abs(num) >= 100) && (Math.abs(num) <1000)){
			System.out.print("Tiene 3 cifras");
		}else if ((Math.abs(num) >= 1000) && (Math.abs(num) <10000)){
			System.out.print("Tiene 4 cifras");
		}else if ((Math.abs(num) >= 10000) && (Math.abs(num) <100000)){
			System.out.print("Tiene 5 cifras");
		}
	}
}
