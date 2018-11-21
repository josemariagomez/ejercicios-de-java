package tema.pkg5;

import java.util.Scanner;

/**
 *
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 * @author josemaria
 */
public class Ejercicio28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero: ");
    int numIntro = Integer.parseInt(s.nextLine());
    int factorial = numIntro;
    for (int i = 1; i < numIntro; i++) {
      factorial *= i;
    }
    System.out.println("El factorial de " + numIntro + " es " + factorial);
  }
}
