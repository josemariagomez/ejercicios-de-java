package tema.pkg7.pkg2;

/**
 *
 * @author jose_
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    int columna = 5;
    int fila = 4;
    
    int[][] tabla = new int[fila][columna];
    
    int[] sumaFila = new int[fila];
    int[] sumaColumna = new int[columna];
    int total = 0;
    
    for (int i = 0; i < fila; i++){
      for (int j = 0; j < columna; j++){
        tabla[i][j] = (int)((Math.random() * 900) + 100);
        
        sumaFila[i] += tabla[i][j]; 
      }
      total += sumaFila[i];
    }
    
    for (int i = 0; i < columna; i++){
      for (int j = 0; j < fila; j++){
        sumaColumna[i] += tabla[j][i];
      }
    }
    
    for (int i = 0; i < fila; i++){
      for (int j = 0; j < columna; j++){
        System.out.printf("%5d ", tabla[i][j]);
      }
      System.out.printf("%5d ", sumaFila[i]);
      System.out.println("");
    }
    
    for (int i = 0; i < columna; i++){
      System.out.printf("%5d ", sumaColumna[i]);
    }
    
    System.out.printf("%5d ", total);
  }
}
