public class Ejercicio1 {
	public static void main(String[] args){
		float x;
		System.out.print("Dime un número: ");
		x = Float.parseFloat(System.console().readLine());
		float y;
		System.out.print("Dime otro: ");
		y = Float.parseFloat(System.console().readLine());
		System.out.println("El resultado del producto de " + x + " y " 
		+ y + " es: " + (x*y));
	}
}
