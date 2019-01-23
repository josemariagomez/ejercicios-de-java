
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    ArrayList<String> p = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    
    for (int i = 1; i < 11; i++) {
      System.out.print("Introduzca 1 palabra(" + i + "/10): ");
      p.add(s.nextLine());
    }
    
    System.out.println(p);
    
    Collections.sort(p);
    System.out.println(p);
    
  }
  
}
