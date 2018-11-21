package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author josemaria
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduce diez números: ");

    int[] num;
    num = new int[10];
    int aux = 0;

    for(int i = 0; i < 10; i++){
      num[aux] = Integer.parseInt(s.nextLine());
      aux++;
    }
    
    System.out.println(" ");
    
    for(int i = 9; i >= 0; i--){
      System.out.print(num[i] + " ");
    }
  }
}
