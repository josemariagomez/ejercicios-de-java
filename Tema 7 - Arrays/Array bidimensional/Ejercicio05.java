package tema.pkg7.pkg2;

public class Ejercicio05 {
  public static void main(String[] args) {
    int columna = 10;
    int fila = 6;
    
    int[][] tabla = new int[fila][columna];
    
    int max = 0;
    int min = 1000;
    
    for (int i = 0; i < fila; i++){
      for (int j = 0; j < columna; j++){
        tabla[i][j] = (int)(Math.random() * 1001);
        if(tabla[i][j] > max){
          max = tabla[i][j];
        }
        if(tabla[i][j] < min){
          min = tabla[i][j];
        }
      }
    }
    
    for (int i = 0; i < fila; i++){
      for (int j = 0; j < columna; j++){
        System.out.printf("%5d ", tabla[i][j]);
      }
      System.out.println("");
    }
    System.out.println("El numero máximo es " + max + " y el mínimo es " + min);
  }
}
