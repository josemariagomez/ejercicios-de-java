public class Ejercicio15 {
	public static void main(String[] args){
		System.out.println("Este programa muestra una pirámide");
		String caracter;
		System.out.print("Introduce el caracter con el que se formará la pirámide: ");
		caracter = System.console().readLine();
		String direccion;
		System.out.println("Introduce el la dirección en la que apuntará: arriba, abajo, izquierda o derecha");
		direccion = System.console().readLine().toLowerCase();
		
		if(direccion.equals("arriba")) {
			System.out.println("  " + caracter);
			System.out.println(" " + caracter + caracter + caracter);
			System.out.println(caracter + caracter + caracter + caracter + caracter);
		}else if(direccion.equals("abajo")){
			System.out.println(caracter + caracter + caracter + caracter + caracter);
			System.out.println(" " + caracter + caracter + caracter);
			System.out.println("  " + caracter);
		}else if(direccion.equals("derecha")){
			System.out.println(caracter);
			System.out.println(caracter + caracter);
			System.out.println(caracter + caracter + caracter);
			System.out.println(caracter + caracter);
			System.out.println(caracter);
		}else if(direccion.equals("izquierda")){
			System.out.println("  " + caracter);
			System.out.println(" " + caracter + caracter);
			System.out.println(caracter + caracter + caracter);
			System.out.println(" " + caracter + caracter);
			System.out.println("  " + caracter);
		}
	}
}
