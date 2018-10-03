public class Ejercicio10 {
	public static void main(String[] args){
		System.out.println("Este programa te dice el horóscopo");
		int dia;
		System.out.print("Introduce tu dia de nacimiento: ");
		dia = Integer.parseInt(System.console().readLine());
		String mes;
		System.out.print("Introduce tu mes de nacimiento (en minúsculas): ");
		mes = System.console().readLine();
		String horoscopo;
		if (((mes.equals("febrero")) && (dia >= 30)) || (dia > 31)){
			System.out.println("Fecha introducida no válida");
		}else if (((mes.equals("enero")) && (dia >= 20)) || ((mes.equals("febrero")) && (dia <= 18))){
			System.out.print("Eres Acuario");
		}else if (((mes.equals("febrero")) && (dia >= 19)) || ((mes.equals("marzo")) && (dia <= 20))){
			System.out.println("Eres Piscis");
		}else if (((mes.equals("marzo")) && (dia >= 21)) || ((mes.equals("abril")) && (dia <= 19))){
			System.out.println("Eres Aries");
		}else if (((mes.equals("abril")) && (dia >= 20)) || ((mes.equals("mayo")) && (dia <= 20))){
			System.out.println("Eres Tauro");
		}else if (((mes.equals("mayo")) && (dia >= 21)) || ((mes.equals("junio")) && (dia <= 20))){
			System.out.println("Eres Géminis");
		}else if (((mes.equals("junio")) && (dia >= 21)) || ((mes.equals("jullio")) && (dia <= 22))){
			System.out.println("Eres Cáncer");
		}else if (((mes.equals("julio")) && (dia >= 23)) || ((mes.equals("agosto")) && (dia <= 22))){
			System.out.println("Eres Leo");
		}else if (((mes.equals("agosto")) && (dia >= 23)) || ((mes.equals("septiembre")) && (dia <= 22))){
			System.out.println("Eres Virgo");
		}else if (((mes.equals("septiembre")) && (dia >= 23)) || ((mes.equals("octubre")) && (dia <= 22))){
			System.out.println("Eres Libra");
		}else if (((mes.equals("octubre")) && (dia >= 23)) || ((mes.equals("noviembre")) && (dia <= 21))){
			System.out.println("Eres Escorpio");
		}else if (((mes.equals("noviembre")) && (dia >= 22)) || ((mes.equals("diciembre")) && (dia <= 21))){
			System.out.println("Eres Sagitario");
		}else if (((mes.equals("diciembre")) && (dia >= 22)) || ((mes.equals("enero")) && (dia <= 19))){
			System.out.println("Eres Capricornio");
		}
	}
}
