/* Programa que declare un vector de diez elementos enteros
 y pida números para rellenarlo hasta que se llene el vector
  o se introduzca un número negativo. Entonces se debe imprimir
   el vector (sólo los elementos introducidos).*/

package Practica2;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numeros []= new double[10];
        int num = 0;
        byte contador = 0;
        for(int i = 0; i<10 ;i++){
            System.out.print("Introdusca un numero : ");
            num = leer.nextInt();
            if (num>=0){
                numeros[i]=num;
                contador ++;
            }else{
                i= 9;
            }
        }
        for(int i = 0; i<contador ;i++){
            System.out.println((int)numeros[i]);// ese int dentro del out sive para mostrar solo el valor entero
        }
        leer.close();
    }
}
