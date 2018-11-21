public class Ejercicio12 {
	public static void main(String[] args){
		System.out.println("Este programa muestre los n primeros términos de la serie de Fibonacci.");
		int n;
		System.out.print("Introduzca n: ");
		n = Integer.parseInt(System.console().readLine());
		switch (n) {
			case 1:
				System.out.println("0");
				break;
			case 2:
				System.out.println("0");
				System.out.println("1");
				break;
			default:
				System.out.println("0");
				System.out.println("1");
				int primero = 0;
				int segundo = 1;
				int nuevoPrimero;
				for(int i = 0; i < (n - 2); i++) {
					nuevoPrimero = primero;
					primero = segundo;
					segundo = nuevoPrimero + segundo;
					System.out.println(segundo);
			
				}
		}
	}
}
