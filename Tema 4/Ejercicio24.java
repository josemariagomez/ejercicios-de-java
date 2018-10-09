public class Ejercicio24 {
	public static void main(String[] args){
		System.out.println("Este programa genera una nómina.");
		int cargo;
		System.out.print("Introduzca el cargo seleccionando un número (1.Programador junior 2.Programador senior 3.Jefe de proyecto): ");
		cargo = Integer.parseInt(System.console().readLine());
		int diasVisita;
		System.out.print("¿Cuántos días ha estado visitando clientes? ");
		diasVisita = Integer.parseInt(System.console().readLine());
		int estadoCivil;
		System.out.print("Introduzca su estado civil (1.Soltero 2.Casado): ");
		estadoCivil = Integer.parseInt(System.console().readLine());
		double sueldoBase = 0;
		switch(cargo) {
			case 1:
				sueldoBase = 950;
				break;
			case 2:
				sueldoBase = 1200;
				break;
			case 3:
				sueldoBase = 1600;
				break;
		}
		double dietas = diasVisita * 30;
		double sueldoBruto = sueldoBase + dietas;
		double irpf = 0;
		if (estadoCivil == 1) {
			irpf = 25;
		}else if(estadoCivil == 2){
			irpf = 20;
		}
		double totalIrpf = (sueldoBruto * irpf) / 100;
		
		System.out.println("Sueldo base     " + sueldoBase);
		System.out.println("Dietas          " + dietas);
		System.out.println("Sueldo bruto    " + sueldoBruto);
		System.out.println("IRPF            " + totalIrpf);
		System.out.println("Sueldo neto     " + (sueldoBruto-totalIrpf));
	}
}
