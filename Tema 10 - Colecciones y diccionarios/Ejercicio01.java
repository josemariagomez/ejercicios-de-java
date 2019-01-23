
import java.util.ArrayList;

public class Ejercicio01 {

  public static void main(String[] args) {
    ArrayList<String> nombre = new ArrayList<>();
    
    nombre.add("Alan Brito");
    nombre.add("Alejandro Gadicto");
    nombre.add("Esteban Quito");
    nombre.add("Lola Mento");
    nombre.add("Aitor Tilla");
    nombre.add("Débora Dora");
    
    for (String n : nombre) {
      System.out.println(n);
    }
  }
  
}
