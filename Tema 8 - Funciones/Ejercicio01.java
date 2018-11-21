package tema.pkg8.funciones;

/**
 *
 * @author jose_
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    
  }
  //1
  public static boolean esCapicua(int n) {
    if (n == voltea(n)){
        return true;
    }
    return false;
  }
  //2
  public static boolean esPrimo(int n) {
    for (int i = 2; i < n; i++){
      if (n % i == 0){
        return false;
      }
    }
    return true;
  }
  
  //3
  public static int siguientePrimo(int n) {
    int i = (n + 1);
    int siguiente;
    do {
      if (esPrimo(i) == true) {
        siguiente = i;
        return siguiente;
      }
      i++;
    }while(1 > 0);
  }
  
  //4
  public static double potencia(int base, int exp) {
    return Math.pow(base, exp);
  }
  
  //5
  public static int digitos(int x) {
    int cifras = 1;
    while(x >= 10) {
			x /= 10;
			cifras++;
		}
    return cifras;
  }
  
  //6
  public static int voltea(int n) {
    int numero = n;
    int volteado = 0;
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    return volteado;
  }
  
  //7
  public static int digitoN(int num, int pos) {
    int cifras = 0;
    int volteado = voltea(num);
    while(cifras < pos) {
			volteado /= 10;
			cifras++;
		}
    return (volteado % 10);
  }
  
}
