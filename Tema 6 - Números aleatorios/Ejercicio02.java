package tema.pkg6;

/*
 *Realiza un programa que muestre al azar el nombre de una carta de la 
 *baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 *diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 
 *cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
 *sería el 1).
 *
 * @author josemaria
 */
public class Ejercicio02 {
public static void main(String[] args) {
    int numeroFigura = (int)((Math.random()*13)+1);
    int numeroPalo = (int)(Math.random()*4);
    
    String figura = "";
    String palo = "";
    
    switch(numeroFigura){
      case 1:
        figura = "As";
        break;
      case 11:
        figura = "J";
        break;
      case 12:
        figura = "Q";
        break;
      case 13:
        figura = "K";
        break;
      default:
        figura = String.valueOf(numeroFigura);
    }
    
    switch(numeroPalo){
      case 0:
        palo = "diamantes";
        break;
      case 1:
        palo = "tréboles";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "picas";
        break;
    }
    
    System.out.println("La carta que ha salido es el " + figura + " de " + palo);
    
  }
}
