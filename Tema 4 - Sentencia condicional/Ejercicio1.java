public class Ejercicio1 {
	public static void main(String[] args){
		System.out.print("Di el día de la semana y pondrá que tienes a primera hora");
		String diaSemana;
		System.out.print("Introduce el dia de la semana: ");
		diaSemana = System.console().readLine();
		if (diaSemana.equals("lunes")){
			System.out.print("Tienes Entornos de desarrollo");
		}
		else if (diaSemana.equals("martes")){
			System.out.print("Tienes Sistemas Informáticos");
		}
		else if (diaSemana.equals("miercoles")){
			System.out.print("Tienes Programación");
		}
		else if (diaSemana.equals("jueves")){
			System.out.print("Tienes Programación");
		}
		else if (diaSemana.equals("viernes")){
			System.out.print("Tienes Sistemas Informáticos");
		}
	}
}
