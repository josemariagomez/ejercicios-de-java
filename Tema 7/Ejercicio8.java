package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author josemaria
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numMes;
    numMes = new int[12];
    
    String[] stringMes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "nomviembre", "diciembre"};
    
    System.out.println("Introduce la temperatura media de cada mes");
    
    for( int i = 0; i < 12; i++){
      System.out.print("El mes de " + stringMes[i] + ": ");
      numMes[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("");
    
    for(int i = 0; i < 12; i++){
      System.out.printf("%12s: ", stringMes[i]);
      for(int j = 1; j <= numMes[i]; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
    
  }
}
