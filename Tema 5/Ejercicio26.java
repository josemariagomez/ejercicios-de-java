public class Ejercicio26 {
	public static void main(String[] args){
		System.out.println("Este programa dice la posición de un dígito.");
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(System.console().readLine());
    int volteado = 0;
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    int posicion = 1;
    int i = 0;
    System.out.print("El digito está en la/s posición/es: ");
    if (numero == digito) {
      System.out.print(posicion + " ");
    }
    while (volteado > 0) {
      if (volteado % 10 == digito) {
        System.out.print(posicion + " ");
      }
    volteado /= 10;
    posicion++;
    }
  }
}
