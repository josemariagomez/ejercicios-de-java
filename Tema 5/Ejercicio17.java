public class Ejercicio17 {
	public static void main(String[] args){
		System.out.println("Este programa suma los 100 números  siguientes al número introducido.");
    int numero = 0;
    do {
      System.out.print("Introduzca un número: ");
      numero = Integer.parseInt(System.console().readLine());
      if(numero < 0) {
        System.out.println("Debe introducir un número positivo.");
      }
    } while (numero < 0);
    int suma = 0;
    for(int i = numero; i < numero + 100; i++) {
      suma += i;
    }
    System.out.println(suma);
  }
}
