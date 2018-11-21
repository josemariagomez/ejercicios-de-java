public class Ejercicio25 {
	public static void main(String[] args){
		System.out.println("Este programa muestra un número volteado.");
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    int volteado = 0;
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    System.out.print("El número volteado es " + volteado);
  }
}
