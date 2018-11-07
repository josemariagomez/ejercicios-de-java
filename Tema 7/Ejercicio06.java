package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author josemaria
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduce diez números: ");

    int[] num;
    num = new int[15];
    
    //Asigna valores
    for( int i = 0; i < 15; i++){
      num[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println("");
    
    for(int elemento : num){
      System.out.print(elemento + " ");
    }
    System.out.println("");
    
    int[] num2;
    num2 = new int[15];
    
    int nuevoPrimero = num[14];
    
    for(int i = 1; i < 15; i++){
        num2[i] = num[i - 1];
    }
    
    num2[0] = nuevoPrimero;
    
     for(int i = 0; i < 15; i++){
      num[i] = num2[i];
    }
    
    System.out.println("");
    for(int elemento : num){
      System.out.print(elemento + " ");
    }
    
  }
}
