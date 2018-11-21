public class Ejercicio6 {
	public static void main(String[] args){
		System.out.println("Este programa calcula el tiempo que tarda en caer un objeto");
		double altura;
		System.out.print("Introduce la altura desde la que cae: ");
		altura = Double.parseDouble(System.console().readLine());
		double tiempo;
		double g = 9.81;
		tiempo = Math.sqrt(2 * altura /g);
		System.out.print("Tardará " + tiempo + "s en caer");
	}
}
