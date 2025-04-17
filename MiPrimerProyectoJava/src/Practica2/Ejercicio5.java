/* Hacer un programa que inicialice un vector de números con valores aleatorios,
 y posterior ordene los elementos de menor a mayor.*/
package Practica2;
import java.util.Arrays;
import java.util.Random;
public class Ejercicio5 {
    public static void main(String[] args) {
        Random numerosRandom = new Random();
        double vector []= new double[10];
        for(int i = 0; i<10 ;i++){
            vector[i]=numerosRandom.nextInt(20);
        }

        System.out.println("---------------");
        System.out.println("vector original");
        for(int i = 0; i<10 ;i++){
            System.out.println((int)vector[i]);
        }
        System.out.println("---------------");
        
          Arrays.sort(vector);//ordena el array de menor a mayor, 

        for (int i = 0; i < 10; i++) {
            System.out.println((int)vector[i]);
        }
    }
}
