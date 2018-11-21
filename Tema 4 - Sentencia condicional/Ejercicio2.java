public class Ejercicio2 {
	public static void main(String[] args){
		System.out.print("¿Qué hora es? ");
		int hora;
		System.out.print("Introduce la hora: ");
		hora = Integer.parseInt(System.console().readLine());
		if ((hora >= 6) && (hora <= 12)){
			System.out.print("Buenos dias");
		}
		else if ((hora >= 13) && (hora <= 20)){
			System.out.print("Buenas tardes");
		}
		else if ((hora >= 21) && (hora <= 5)){
			System.out.print("Burnas noches");
		}
	}
}
