package tema.pkg8;

import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número decimal: ");
    int decimal = Integer.parseInt(s.nextLine());
    int binario = 4;
    
    for (int i = decimal; i > 1; i /= 2) {
      binario = (binario * 10) + (i % 2);
      if (i < 4) {
        binario = (binario * 10) + (i / 2);
      }
    }
    binario = (Ejercicio01.voltea(binario) / 10);
    System.out.println("En decimal corresponde al: " + binario);
  }
}