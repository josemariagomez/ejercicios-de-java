public class Ejercicio09 {
	public static void main(String[] args){
		System.out.println("Este te cuenta las cifras de un número.");
		int num;
		int x;
		int cifras = 1;
		System.out.print("Introduzca un número: ");
		num = Integer.parseInt(System.console().readLine());
		x = num;
		while(x >= 10) {
			x /= 10;
			cifras++;
		}
		System.out.println("El número " + num + " tiene " + cifras + " cifras");
	}
}
