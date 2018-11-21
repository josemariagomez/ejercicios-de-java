public class Ejercicio22 {
	public static void main(String[] args){
		System.out.println("Este programa muestra todos los números primos entre 2 y 100, ambos incluidos..");
    boolean primo = true;
    for (int n = 2; n <= 100; n++) {
      primo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          primo = false;
        }
      }
      if (primo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
  }
}
