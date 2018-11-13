package tema.pkg7.pkg2;

/**
 *
 * @author jose_
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    int columna = 6;
    int fila = 3;
    
    int[][] num = new int[fila][columna];
    
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    for (int i = 0; i < fila; i++){
      for (int j = 0; j < columna; j++){
        System.out.printf("%3d ", num[i][j]);
      }
      
      System.out.println("");
    }
  }
}