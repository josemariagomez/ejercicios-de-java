public class Ejercicio14 {
	public static void main(String[] args){
		System.out.println("Este programa calcula una potencia.");
		System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    System.out.println(base + "^" + exponente + " = " + (Math.pow(base,exponente)));
  }
}
