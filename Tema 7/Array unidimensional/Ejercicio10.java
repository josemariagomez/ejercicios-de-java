package tema.pkg7;

/**
 *
 * @author josemaria
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    int[] num;
    num = new int[20];
    
    int[] aux;
    aux = new int[20];
    
    int j = 0;
    
    for( int i = 0; i < 20; i++){
      num[i] = (int)(Math.random() * 101);
    }
    
    for(int elemento : num){
      System.out.print(elemento + " ");
    }
    
    for( int i = 0; i < 20; i++){
      if((num[i] % 2) == 0){
        aux[j] = num[i];
        j++;
      }
    }
    
    for( int i = 0; i < 20; i++){
      if((num[i] % 2) != 0){
        aux[j] = num[i];
        j++;
      }
    }
    
    System.out.println("");
    System.out.println("");
    
    for(int elemento : aux){
      System.out.print(elemento + " ");
    }
    
  }  
}
