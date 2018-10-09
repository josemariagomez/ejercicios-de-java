public class Ejercicio12 {
	public static void main(String[] args){
		System.out.println("Test DAM. Elige a, b o c en cada pregunta");
		String preg1, preg2, preg3, preg4, preg5, preg6, preg7, preg8, preg9, preg10;
		int nota;
		nota = 0;
		System.out.print("¿Qué variable sirve para números enteros? a-int b-String c-float ");
		preg1 = System.console().readLine().toLowerCase();
		if (preg1.equals("a")){
			nota++;
		}
		System.out.print("¿Qué variable sirve para cadenas de caracteres? a-int b-String c-float ");
		preg2 = System.console().readLine().toLowerCase();
		if (preg2.equals("b")){
			nota++;
		}
		System.out.print("¿Qué variable sirve para números decimales? a-int b-String c-float ");
		preg3 = System.console().readLine().toLowerCase();
		if (preg3.equals("c")){
			nota++;
		}
		System.out.print("¿Qué frase se suele poner en el primer programa? a-Viva Java b-Hola mundo c-Vaya programa guapo ");
		preg4 = System.console().readLine().toLowerCase();
		if (preg4.equals("b")){
			nota++;
		}
		System.out.print("¿Qué va justo detrás de if? a-() b-{} c-¿? ");
		preg5 = System.console().readLine().toLowerCase();
		if (preg5.equals("a")){
			nota++;
		}
		System.out.print("¿Qué es correcto? a-if else b-else if c-elsif ");
		preg6 = System.console().readLine().toLowerCase();
		if (preg6.equals("b")){
			nota++;
		}
		System.out.print("¿Qué se pone tras un switch? a-else b-if c-case ");
		preg7 = System.console().readLine().toLowerCase();
		if (preg7.equals("c")){
			nota++;
		}
		System.out.print("¿Qué se pone al final de cada case para cortar el flujo? a-break b-stop c-pause ");
		preg8 = System.console().readLine().toLowerCase();
		if (preg8.equals("a")){
			nota++;
		}
		System.out.print("¿Cuál es un lenguaje de marcas? a-Java b-Ruby c-HTML ");
		preg9 = System.console().readLine().toLowerCase();
		if (preg9.equals("c")){
			nota++;
		}
		System.out.print("¿Qué etiqueta sirve para poner un párrafo en HTML? a-<parag> b-<p> c-Ninguna de las anteriores ");
		preg10 = System.console().readLine().toLowerCase();
		if (preg10.equals("b")){
			nota++;
		}
		System.out.println("Has sacado un " + nota);
	}
}
