public class Ejercicio3 {
	public static void main(String[] args){
		int num;
		System.out.println("Di un número del 1 al 7 ");
		num = Integer.parseInt(System.console().readLine());
		if (num == 1){
			System.out.print("Lunes");
		}
		else if (num == 2){
			System.out.print("Martes");
		}
		else if (num == 3){
			System.out.print("Miércoles");
		}
		else if (num == 4){
			System.out.print("Jueves");
		}
		else if (num == 5){
			System.out.print("Viernes");
		}
		else if (num == 6){
			System.out.print("Sábado");
		}
		else if (num == 7){
			System.out.print("Domingo");
		}
	}
}
