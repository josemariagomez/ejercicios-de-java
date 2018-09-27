public class Ejercicio9 {
	public static void main(String[] args){
		double radio;
		System.out.print("Introduce el radio del cono: ");
		radio = Double.parseDouble(System.console().readLine());
		double altura;
		System.out.print("Introduce la altura del cono: ");
		altura = Double.parseDouble(System.console().readLine());
		double area;
		area = radio * radio * altura * Math.PI / 3;
		System.out.print("El área del cono es " + area + " u²");
	}
}
