public class Ejercicio15 {
	public static void main(String[] args){
		System.out.println("Este programa muestra potencias.");
		System.out.print("Introduzca la base: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca un exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    double potencia;
    int exponentes;
    for (int i = 1; i <= exponente; i++) {
      potencia = 1;
      exponentes = i;
      for (int j = 0; j < exponentes; j++) {
        potencia *= base;
      }
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}
