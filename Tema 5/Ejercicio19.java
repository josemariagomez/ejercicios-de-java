public class Ejercicio19 {
	public static void main(String[] args){
		System.out.println("Este programa muestra una pirámide.");
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    int nivel = 1;
    int longitud = 1;
    int espacios = altura-1;
    while (nivel <= altura) {
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (int i = 1; i <= longitud; i++) {
        System.out.print(relleno);
      }
      System.out.println();
      nivel++;
      espacios--;
      longitud += 2;
    }
  }
}
