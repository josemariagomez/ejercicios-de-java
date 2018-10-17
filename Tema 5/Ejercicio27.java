package tema.pkg5;


import java.util.Scanner;

/**
 *
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * @author josemaria
 */
public class Ejercicio27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero: ");
    int numIntro = Integer.parseInt(s.nextLine());
    int numero = numIntro;
    int cuenta = 0;
    int suma = 0;
    System.out.print("Los múltiplos de 3 que hay entre " + numIntro + " y 1 son: ");
    while (numero > 1) {
      if (numero % 3 == 0){
        System.out.print(numero + " ");
        cuenta++;
        suma += numero;
      }
      numero--;
    }
    System.out.println("");
    System.out.println("Son " + cuenta + " múltiplos");
    System.out.println("Suman " + suma);
  }
}