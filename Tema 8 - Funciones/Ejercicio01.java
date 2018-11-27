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
  
  //8
  public static int posicionDeDigito(int num, int cifra) {
    int posicion = 0;
    int volteado = voltea(num);
    int aux;
    do {
			aux = volteado / 10;
      volteado /= 10;
			posicion++;
		}while((aux != cifra) && (volteado > 0));
    if (aux == cifra) {
      return posicion;
    }else{
      return -1;
    }
  }
  
  //9
  public static int quitaPorDetras(int num, int pos) {
    for (int i = 0; i < pos; i++) {
      num /= 10;
    }
    return num;
  }
  
  //10
  public static int quitaPorDelante(int num, int pos) {
    int volteado = voltea(num);
    for (int i = 0; i < pos; i++) {
      volteado /= 10;
    }
    return volteado;
  }
  
  //11
  public static int pegaPorDetras(int num, int dig) {
    return (num * 10 + dig);
  }
  
  //12
  public static int pegaPorDelante(int num, int dig) {
    int volteado = voltea(num);
    volteado = pegaPorDetras(volteado, dig);
    return voltea(volteado);
  }
  
  //13
  public static int trozoDeNumero(int num, int dig) {
    int volteado = voltea(num);
    volteado = pegaPorDetras(volteado, dig);
    return voltea(volteado);
  }
    
    //14
  public static int juntaNumeros(int num1, int num2) {
    int cifras = digitos(num2);
    int resultado = ((num1 * 10 * cifras) + num2);
    return resultado;
  }
}
