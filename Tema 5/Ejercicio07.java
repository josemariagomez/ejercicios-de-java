public class Ejercicio07 {
	public static void main(String[] args){
		int combinacion = 2818;
		boolean respuesta = false;
		int intentos = 0;
		int numIntento;
		System.out.println("Introduzca la combinación de la caja: ");
		numIntento = Integer.parseInt(System.console().readLine());
		do {
			if (numIntento == combinacion){
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				respuesta = true;
			} else {
				System.out.println("Lo siento, esa no es la combinación");
				System.out.println("Inténtalo de nuevo: ");
				numIntento = Integer.parseInt(System.console().readLine());
				++intentos;
			}
		}while((respuesta == false) && (intentos < 4));
		
	}
}
