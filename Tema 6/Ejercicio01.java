package tema.pkg6;

/**
 *
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author josemaria
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra la tirada de 3 dados.");
    
    int tirada1 = (int)((Math.random() * 6) + 1);
    int tirada2 = (int)((Math.random() * 6) + 1);
    int tirada3 = (int)((Math.random() * 6) + 1);
    
    int total = tirada1 + tirada2 + tirada3;
    
    System.out.println("Ha salido el " + tirada1);
    System.out.println("Ha salido el " + tirada2);
    System.out.println("Ha salido el " + tirada3);
    
    System.out.println("En total suman " + total);
    
  }
}
