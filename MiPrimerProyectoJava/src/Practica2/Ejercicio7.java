package PracticasArrays;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Declarar los vectores
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 valores para el vector1:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }
        System.out.println("Introduce 5 valores para el vector2:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
        System.out.println("El vector3 (suma de vector1 y vector2) es:");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + vector3[i]);
        }

        scanner.close();
    }
}