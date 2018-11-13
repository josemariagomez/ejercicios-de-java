package tema.pkg7;

/**
 *
 * @author josemaria
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    String[]  x;
    x = new String[10];
    
    x[0] = "'a'";
    x[1] = "'x'";
    x[4] = "'@'";
    x[6] = "' '";
    x[7] = "'+'";
    x[8] = "'Q'";
    
    for (int i = 0; i < 10; i++) {
      System.out.println(x[i]);
    }
  }
  
}
