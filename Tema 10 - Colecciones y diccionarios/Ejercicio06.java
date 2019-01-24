
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    HashMap<String, String> usuarios = new HashMap<>();
    usuarios.put("admin", "admin");
    usuarios.put("user", "user");
    
    boolean acceso = false;
    boolean existe = false;
    
    String user;
    do{
      System.out.print("User: ");
      user = s.nextLine();
      
      existe = usuarios.containsKey(user);
      
      if (!existe){
        System.out.println("Introduzca un usuario válido.");
      }
    }while(!existe);
    
    
    for (int i = 0; i < 3 && !acceso; i++) {
      System.out.print("Password: ");
      String pass = s.nextLine();
    
      if (pass.equals(usuarios.get(user))) {
        System.out.println("\033[32mHas accedido a la zona restringida");
        acceso = true;
      }else {
        System.out.println("\033[30mContraseña incorrecta. Intento " + (i + 1) + " de 3.");
      }
    }
    
    if(!acceso){
      System.out.println("\033[31mNo tienes acceso a la zona restringida");
    }
    
  }
  
}
