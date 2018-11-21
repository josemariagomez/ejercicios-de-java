public class Ejercicio3 {
	public static void main(String[] args){
		double pesetas;
		System.out.println("Vamos a pasar pesetas a euros.");
		System.out.print("Dime cuantas pesetas quieres convertir: ");
		pesetas = Double.parseDouble(System.console().readLine());
		double euros;
		euros = pesetas / 166.386;
		System.out.print(pesetas + " pesetas son: " + euros + "euros");
	}
}
