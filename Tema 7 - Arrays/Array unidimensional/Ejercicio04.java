package tema.pkg7;

/**
 *
 * @author josemaria
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    int[] num = new int[20];
    int[] num2 = new int[20];
    int[] num3 = new int[20];
    
    for(int i = 0; i < 20; i++){
      num[i] = (int)(Math.random() * 101);
      num2[i] = (num[i] * num[i]);
      num3[i] = (num2[i] * num[i]);
    }
    
    for(int i = 0; i < 20; i++){
      System.out.println(num[i] + " " + num2[i] + " " + num3[i]);
    }
  }
}
