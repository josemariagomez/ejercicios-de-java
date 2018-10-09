public class Ejercicio22 {
	public static void main(String[] args){
		System.out.println("Este programa te dice los segundos que quedan hasta el fin de semana");
		int hora, min, numDia;
		numDia = 0;
		String dia;
		System.out.print("Introduce el día de la semana que es: ");
		dia = System.console().readLine().toLowerCase();
		System.out.print("Introduce la hora que es: ");
		hora = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce los minutos: ");
		min = Integer.parseInt(System.console().readLine());
		switch(dia) {
			case "lunes":
				numDia = 1;
				break;
			case "martes":
				numDia = 2;
				break;
			case "miercoles":
				numDia = 3;
				break;
			case "jueves":
				numDia = 4;
				break;
			case "viernes":
				numDia = 5;
				break;
		}
		
		int minTotales = (5 * 24 * 60) + (15 * 60);
		int minActuales = (numDia * 24 * 60) + (hora * 60) + min;
		System.out.print("Faltan " + (minTotales - minActuales) + " minutos para el fin de semana.");
	}
}
