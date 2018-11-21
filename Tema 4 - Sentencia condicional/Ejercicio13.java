public class Ejercicio13 {
	public static void main(String[] args){
		System.out.println("Este programa ordena los números introducidos");
		int num1, num2, num3;
		System.out.print("Introduce el primer número: ");
		num1 = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce el segundo número: ");
		num2 = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce el tercer número: ");
		num3 = Integer.parseInt(System.console().readLine());
		if ((num1 < num2) && (num1 < num3)){
			System.out.print(num1 + "<");
			if (num2 < num3){
				System.out.print(num2 + "<");
				System.out.print(num3);
			}else{
				System.out.print(num3 + "<");
				System.out.print(num2);
			}
		}
		if ((num2 < num1) && (num2 < num3)){
			System.out.print(num2 + "<");
			if (num1 < num3){
				System.out.print(num1 + "<");
				System.out.print(num3);
			}else{
				System.out.print(num3 + "<");
				System.out.print(num1);
			}
		}
		if ((num3 < num2) && (num3 < num1)){
			System.out.print(num3 + "<");
			if (num2 < num1){
				System.out.print(num2 + "<");
				System.out.print(num1);
			}else{
				System.out.print(num1 + "<");
				System.out.print(num2);
			}
		}
	}
}
