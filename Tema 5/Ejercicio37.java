/*
 *
 * 
 * 
 */


public class Ejercicio37 {
	public static void main (String[] args) {
		System.out.println("Introduce un número entero positivo: ");
    long numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    //voltear numero
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    while ()
	}
}

