package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author josemaria
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduce diez números: ");

    int[] num;
    num = new int[10];
    
    
    //Asigna valores
    for(int i = 0; i < 10; i++){
      num[i] = Integer.parseInt(s.nextLine());
    }
    
    int maximo = num[0];
    int minimo = num[0];
    
    for(int i = 0; i < 10; i++){
      if(num[i] > maximo){
        maximo = num[i];
      }
      
      if(num[i] < minimo){
        minimo = num[i];
      }
    }
    
    for(int i = 0; i < 10; i++){
      System.out.print(num[i]);
      
      if(num[i] == maximo){
        System.out.print(" máximo");
      }
      
      if(num[i] == minimo){
        System.out.print(" mínimo");
      }
      
      System.out.println9("");
    }

  }
}
