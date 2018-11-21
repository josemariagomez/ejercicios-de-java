package tema.pkg6;

/**
 *
 * @author josemaria
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    int numero = 0;
    int aux = 0;
    int max = 0;
    int min = 199;
    
    for (int i = 0; i < 50; i++) {
      numero = (int)((Math.random()*100) + 100);
      System.out.print(numero + " ");
      aux += numero;
      
      while (numero > max) {
        max = numero;
      }
      while (numero < min) {
        min = numero;
      }
    }
    int media = aux / 50;
    System.out.println("");
    System.out.println("La media es " + media);
    System.out.println("El número máximo es " + max);
    System.out.println("El número mínimo es " + min);
    
  }
}
