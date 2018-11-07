package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author josemaria
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] num;
    num = new int[8];
    
    System.out.println("Introduzca 8 números: ");
    
    for( int i = 0; i < 8; i++){
      num[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("");
    
    for (int elemento : num){
      if((elemento % 2) == 0){
        System.out.println(elemento + " par");
      }else{
        System.out.println(elemento + " impar");
      }
    }
    
  }
}
