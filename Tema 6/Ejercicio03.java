//package tema.pkg6;

/**
 *
 * @author josemaria
 */
public class Ejercicio03 {
public static void main(String[] args) {
    int numeroFigura = (int)((Math.random()*10)+1);
    int numeroPalo = (int)(Math.random()*4);
    
    String figura = "";
    String palo = "";
    
    switch(numeroFigura){
      case 1:
        figura = "as";
        break;
      case 8:
        figura = "sota";
        break;
      case 9:
        figura = "caballo";
        break;
      case 10:
        figura = "rey";
        break;
      default:
        figura = String.valueOf(numeroFigura);
    }
    
    switch(numeroPalo){
      case 0:
        palo = "oro";
        break;
      case 1:
        palo = "basto";
        break;
      case 2:
        palo = "copas";
        break;
      case 3:
        palo = "espada";
        break;
    }
    
    System.out.println("La carta que ha salido es el " + figura + " de " + palo);
    
  }
  
}
