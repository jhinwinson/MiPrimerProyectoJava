/*Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros,
 a continuación lo inicialice con valores aleatorios (del 1 al 10) 
 y posteriormente muestre en pantalla cada elemento del vector junto
 con su cuadrado y su cubo. */

package Practica2;
import java.util.Random;
public class Ejercicio1 {  // recuerda las varibles estilo camel case no con _
     public static void main(String[] args) {
    int vectorNumeros [] =new int[10];
    Random numerosRamdom = new Random();
    for (int i = 0; i<vectorNumeros.length ;i++){//.length devuelve el tamaño del array en este caso 10
        vectorNumeros[i]= numerosRamdom.nextInt(10)+1;// el numero 10 no se incluye solo va hasta el 1, y se le esta sumando 1 para que no empieze desde 0
    }
    for (int i = 0; i<vectorNumeros.length ;i++){
      System.out.println("el cuadrado del numero : "+vectorNumeros[i]+" es "+(vectorNumeros[i]*vectorNumeros[i]));
      System.out.println("el cubo del numero : "+vectorNumeros[i]+" es "+(vectorNumeros[i]*vectorNumeros[i]*vectorNumeros[i]));
    }
    }
}
