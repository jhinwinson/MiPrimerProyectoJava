/*Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4)
 y diga cuántos días tiene (por ejemplo, 30)
 y el nombre del mes. Debes usar un vector. Para simplificarlo vamos a suponer
 que febrero tiene 28 días. */
 package Practica2;
 import java.util.Scanner;
 public class Ejercicio6 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String[] meses = {
             "Enero", "Febrero", "Marzo", "Abril",
             "Mayo", "Junio", "Julio", "Agosto",
             "Septiembre", "Octubre", "Noviembre", "Diciembre"
         };
         int[] dias = {
             31, 28, 31, 30,
             31, 30, 31, 31,
             30, 31, 30, 31
         };
         System.out.println("Ingresa un número de mes: ");
         int num = leer.nextInt();
         num-=1;
         System.out.println("el mes "+meses[num]+"tiene "+dias[num]+" dias");
         leer.close();
     }
 }
 