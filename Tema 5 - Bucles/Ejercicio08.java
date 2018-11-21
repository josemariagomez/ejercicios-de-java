public class Ejercicio08 {
	public static void main(String[] args){
		System.out.println("Este programa muestra la tabla de multiplicar de un número.");
		int num;
		System.out.print("Introduzca un número: ");
		num = Integer.parseInt(System.console().readLine());
		for(int i = 0 ; i < 11 ; i++) {
			System.out.println(num * i);
		}
		
	}
}
