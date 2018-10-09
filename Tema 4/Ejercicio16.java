public class Ejercicio16 {
	public static void main(String[] args){
		System.out.println("¿Es tu pareja infiel? Responde si o no");
		String preg1, preg2, preg3, preg4, preg5, preg6, preg7, preg8, preg9, preg10;
		int nota = 0;
		System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente ");
		preg1 = System.console().readLine().toLowerCase();
		System.out.print("Ha aumentado sus gastos de vestuario ");
		preg2 = System.console().readLine().toLowerCase();
		System.out.print("Ha perdido el interés que mostraba anteriormente por ti ");
		preg3 = System.console().readLine().toLowerCase();
		System.out.print("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) ");
		preg4 = System.console().readLine().toLowerCase();
		System.out.print("No te deja que mires la agenda de su teléfono móvil ");
		preg5 = System.console().readLine().toLowerCase();
		System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
		preg6 = System.console().readLine().toLowerCase();
		System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a ");
		preg7 = System.console().readLine().toLowerCase();
		System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo ");
		preg8 = System.console().readLine().toLowerCase();
		System.out.print("Has notado que últimamente se perfuma más ");
		preg9 = System.console().readLine().toLowerCase();
		System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo ");
		preg10 = System.console().readLine().toLowerCase();
		if (preg1.equals("si")) {
			nota++;
		}
		if (preg2.equals("si")) {
			nota++;
		}
		if (preg3.equals("si")) {
			nota++;
		}
		if (preg4.equals("si")) {
			nota++;
		}
		if (preg5.equals("si")) {
			nota++;
		}
		if (preg6.equals("si")) {
			nota++;
		}
		if (preg7.equals("si")) {
			nota++;
		}
		if (preg8.equals("si")) {
			nota++;
		}
		if (preg9.equals("si")) {
			nota++;
		}
		if (preg10.equals("si")) {
			nota++;
		}
		if ((nota * 3) <= 10) {
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		}
		if (((nota * 3) > 10) && ((nota * 3) <= 22)) {
			System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		}
		if ((nota * 3) > 22) {
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}
		
	}
}
