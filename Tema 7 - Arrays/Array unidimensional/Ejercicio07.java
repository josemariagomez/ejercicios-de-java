package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author josemaria
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] aleatorio;
    aleatorio = new int[100];
    
    for( int i = 0; i < 100; i++){
      aleatorio[i] = (int)(Math.random() * 21);
    }
    
    for(int elemento : aleatorio){
      System.out.print(elemento + " ");
    }
    
    System.out.println("");
    System.out.println("Introduzca 2 números: ");
    
    int num1 = Integer.parseInt(s.nextLine());
    int num2 = Integer.parseInt(s.nextLine());
    
    for( int i = 0; i < 100; i++){
      if(aleatorio[i] != num1){
        System.out.print(aleatorio[i] + " ");
      }
      
      if(aleatorio[i] == num1){
        aleatorio[i] = num2;
        System.out.print("\"" + aleatorio[i] + "\"" + " ");
      }
    }
    
  }
}
