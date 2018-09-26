public class Ejercicio2 {
	public static void main(String[] args){
		double euros;
		System.out.println("Vamos a pasar euros a pesetas.");
		System.out.print("Dime cuantos euros quieres convertir: ");
		euros = Double.parseDouble(System.console().readLine());
		double pesetas;
		pesetas = euros * 166.386;
		System.out.print(euros + " euros son: " + pesetas + "pesetas");
	}
}
