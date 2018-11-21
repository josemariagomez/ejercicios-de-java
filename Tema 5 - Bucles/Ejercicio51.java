/*
 *
 * 
 * 
 */


public class Ejercicio51 {
	public static void main (String[] args) {
		System.out.println("Introduce un número entero positivo: ");
    long numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int auxiliar = 0;
    long numeroComido = 0;
    
    // Voltea el número introducido.
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    while (volteado > 0) {
    auxiliar = (int)(volteado % 10);
    
    volteado /= 10;
    
    if ((auxiliar != 0) && (auxiliar != 8)) {
        numeroComido *= 10; //numeroComido = numeroComido * 10
        numeroComido += auxiliar;
      }
    }
    
    if (numeroComido == numeroIntroducido) {
      System.out.println("El gusano no se ha comido ningún número");
    } else {
      System.out.println("El número después de ser comido es " + numeroComido);
    }
  }
}

