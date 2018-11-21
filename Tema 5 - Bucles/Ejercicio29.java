package tema.pkg5;


import java.util.Scanner;

/**
 *
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 * 
 * @author josemaria
 */
public class Ejercicio29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numIntro1;
    int numIntro2;
    
    //Verifica que sean positivos
    do {
      System.out.print("Introduzca un número entero positivo: ");
      numIntro1 = Integer.parseInt(s.nextLine());
      
      if (numIntro1 < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numIntro1 < 0);
    
    do {
      System.out.print("Introduzca otro: ");
      numIntro2 = Integer.parseInt(s.nextLine());
      
      if (numIntro2 < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numIntro2 < 0);
    
    int num1 = numIntro1;
    int num2 = numIntro2;
    System.out.print("Los números menores que " + numIntro1 + " y no divisibles entre " + numIntro2 + " son: ");
    while (num1 > 0) {
      if (num1 % num2 != 0){
        System.out.print(num1 + " ");
      }
      num1--;
    }
  }
}