public class Ejercicio23 {
	public static void main(String[] args){
		System.out.println("Este programa calcula el precio final de un producto según su base imponible, el tipo de IVA aplicado y el código promocional.");
		double baseImp;
		String iva, codigo;
		System.out.print("Introduzca la base imponible: ");
		baseImp = Double.parseDouble(System.console().readLine());
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		iva = System.console().readLine().toLowerCase();
		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		codigo = System.console().readLine().toLowerCase();
		int numIva;
		numIva = 0;
		switch(iva) {
			case "general":
				numIva = 21;
				break;
			case "reducido":
				numIva = 10;
				break;
			case "superreducido":
				numIva = 4;
				break;
			}
			double totalIva = baseImp * numIva / 100;
			double precio = baseImp + totalIva;
			double descuento = 0;
			switch(codigo) {
				case "nopro":
					break;
				case "mitad":
					descuento = precio / 2;
					break;
				case "meno5":
					descuento = 5;
					break;
				case "5porc":
					descuento = precio * 0.05;
					break;
			}
			double total = precio - descuento;
			System.out.println("Base imponible      " + baseImp);
			System.out.println("IVA" + numIva + "%              " + totalIva);
			System.out.println("Precio + IVA        " + precio);
			System.out.println("Código promo " + codigo + "  -" + descuento);
			System.out.println("Total               " + total);
		}
}
