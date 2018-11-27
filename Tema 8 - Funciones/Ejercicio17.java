package tema.pkg8;

import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número binario: ");
    int binario = Integer.parseInt(s.nextLine());
    int decimal = 0;
    int posicion = 0;
    
    for (int i = binario; i > 0; i /= 10) {
      decimal += Math.pow(2, posicion) * (i % 10); 
      posicion++;
    }
    System.out.println("En decimal corresponde al: " + decimal);
  }
  
}