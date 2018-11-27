/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg8.funciones;

import static tema.pkg8.funciones.Ejercicio01.esPrimo;

/**
 *
 * @author jose_
 */
public class Ejercicio15 {
  
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      if (esPrimo(i) == true) {
        System.out.print(i + " ");
      }
    }
  }
  
}
