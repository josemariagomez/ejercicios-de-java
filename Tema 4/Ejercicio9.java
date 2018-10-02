public class Ejercicio9 {
	public static void main(String[] args){
		System.out.println("Este programa resuelve una ecuación del tipo ax² + bx + c = 0");
		double a;
		System.out.print("Introduce a: ");
		a = Double.parseDouble(System.console().readLine());
		double b;
		System.out.print("Introduce b: ");
		b = Double.parseDouble(System.console().readLine());
		double c;
		System.out.print("Introduce c: ");
		c = Double.parseDouble(System.console().readLine());
		double resRaiz;
		double x1;
		double x2;
		resRaiz = Math.pow(b, 2) - (4 * a * c);
		if (resRaiz > 0){
			x1 = (-b + Math.sqrt(resRaiz)) / 2 * a;
			x2 = (-b - Math.sqrt(resRaiz)) / 2 * a;
			System.out.println("Las soluciones son: " + x1 + "y " + x2);
		}else {
			System.out.println("No tiene solución");
		}
	}
}
