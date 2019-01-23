
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {
    ArrayList<Integer> n = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    
    for (int i = 1; i < 11; i++) {
      System.out.print("Introduzca 1 número(" + i + "/10): ");
      n.add(Integer.parseInt(s.nextLine()));
    }
    
    System.out.println(n);
    
    Collections.sort(n);
    System.out.println(n);
    
  }
  
}
