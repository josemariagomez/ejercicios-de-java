public class Ejercicio12 {
	public static void main(String[] args){
		System.out.println("Test DAM");
		String Preg1;
		System.out.print("Introduce la hora: ");
		hora = Integer.parseInt(System.console().readLine());
		int minuto;
		System.out.print("Introduce los minutos: ");
		minuto = Integer.parseInt(System.console().readLine());
		int horaRestante;
		int minRestante;
		int segRestante;
		if (((hora < 0) || (hora >= 24)) || ((minuto > 59) || (minuto < 0))){
			System.out.println("Hora introducida no válida");
		}else {
			horaRestante = (24 - hora) * 3600;
			minRestante = (60 - minuto) * 60;
			segRestante = horaRestante + minRestante;
			System.out.println("Quedan " + segRestante + "s para medianoche");
		}
	}
}
