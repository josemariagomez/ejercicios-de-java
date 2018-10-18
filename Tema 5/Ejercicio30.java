package tema.pkg5;


import java.util.Scanner;

/**
 * 
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 * 
 * @author josemaria
 */
public class Ejercicio30 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int diaIntro1;
    int diaIntro2;
    int hora1;
    int hora2;
    
    //Verifica que sean valores correctos
    do {
      System.out.print("Introduzca el número de un día de la semana (comienza en lunes): ");
      diaIntro1 = Integer.parseInt(s.nextLine());
      
      if ((diaIntro1 < 1) || (diaIntro1 > 7)) {
        System.out.println("El número introducido no es correcto.");
      }
    } while ((diaIntro1 < 1) || (diaIntro1 > 7));
    
    do {
      System.out.print("Introduzca la hora que es: ");
      hora1 = Integer.parseInt(s.nextLine());
      
      if ((hora1 < 0) || (hora1 >= 24)) {
        System.out.println("El número introducido no es correcto.");
      }
    } while ((hora1 < 0) || (hora1 >= 24));
    
    do {
      System.out.print("Introduzca otro: ");
      diaIntro2 = Integer.parseInt(s.nextLine());
      
      if ((diaIntro2 < 1) || (diaIntro2 > 7)) {
        System.out.println("El número introducido no es correcto.");
      }
    } while ((diaIntro2 < 1) || (diaIntro2 > 7));
    
    do {
      System.out.print("Introduzca la hora que es: ");
      hora2 = Integer.parseInt(s.nextLine());
      
      if ((hora2 < 0) || (hora2 >= 24)) {
        System.out.println("El número introducido no es correcto.");
      }
    } while ((hora2 < 0) || (hora2 >= 24));
    
    //Cálculos
    
    int horasDia1 = diaIntro1 * 24;
    int horasDia2 = diaIntro2 * 24;
    
    int totalHoras1 = horasDia1 + hora1;
    int totalHoras2 = horasDia2 + hora2;
    
    int diferenciaHoras = totalHoras2 - totalHoras1;
    
    System.out.println("Entre el día " + diaIntro1 + " a las " + hora1 + 
      " y el día " + diaIntro2 + " a las " + hora2 + " hay " + diferenciaHoras +
       " horas.");
  }
}