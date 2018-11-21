package tema.pkg7.pkg2;

import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int fila = 8;
    int columna = 8;
    
    int tablero[][] = new int[columna][fila];
    
    System.out.print("Introduzca la posición del alfil: ");
    String posicionAlfil = s.nextLine();
    
    System.out.println("El alfil puede moverse a las siguientes posiciones:");
    
    //Convertimos la posición en coordenadas
    char charFila = posicionAlfil.charAt(0);
    int numeroFila = (charFila - 97);
    
    char charColumna = posicionAlfil.charAt(1);
    int numeroColumna = (8 - (charColumna - 48));
    
    
    //Mostramos las posiciones posibles del alfil ♗
    for (int i = 0; i < columna; i++) {
      for (int j = 0; j < fila; j++) {
        if ((Math.abs(numeroColumna - i) == Math.abs(numeroFila - j)) && (i != numeroColumna) && (j != numeroFila)) {

          tablero[i][j] = 1;
          
        }
      }
    }
    for (int i = 0; i < columna; i++) {      
      for (int j = 0; j < fila; j++) {
        if (tablero[i][j] == 1){
          System.out.print("\033[32m█");
          System.out.print(" ");
        }else if ((i == numeroColumna) && (j == numeroFila)) {
          System.out.print("\033[30m♗");
          System.out.print(" ");
        }else {
          System.out.print("\033[37m█");
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    System.out.println("");
  } 
}
