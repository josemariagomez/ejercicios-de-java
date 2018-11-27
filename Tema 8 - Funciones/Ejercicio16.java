package tema.pkg8;

import tema.pkg8.Ejercicio01;

/**
 *
 * @author jose_
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      if (Ejercicio01.esCapicua(i) == true) {
        System.out.print(i + " ");
      }
    }
  }
  
}
