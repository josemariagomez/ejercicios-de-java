
import java.util.ArrayList;

public class Ejercicio02 {

  public static void main(String[] args) {
    ArrayList<Integer> n = new ArrayList<>();
    
    //Genera el ArrayList
    for (int i = 0; i < aleatorio(10, 20); i++) {
      n.add(aleatorio(0, 100));
      
    }
    
    //Calcula la suma, el mínimo y el máximo
    int suma = 0;
    int min = n.get(0);
    int max = n.get(0);
    
    for (Integer numero : n) {
      suma += numero;
      
      /*
      if (numero > max){
        max = numero;
      }
       */
      max = numero > max ? numero : max; //Pregunta si numero > max,
                                         //caso de serlo, devuelve numero,
                                         //en caso de no serlo, devuelve max
      /*
      if (numero < min){
        min = numero;
      }
      */
      min = numero < min ? numero : min;
    }
    
    System.out.println(n);
    System.out.println("Suma: " + suma);
    System.out.println("Mínimo: " + min);
    System.out.println("Máximo: " + max);
  }
  
  public static int aleatorio(int min, int max){
    return (int)(Math.random() * (max - min + 1)) + min;
  }
}
